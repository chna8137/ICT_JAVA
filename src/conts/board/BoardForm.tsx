import React, { useState } from 'react'
import style from './board.module.css'
import { Link, useNavigate } from 'react-router-dom'

const BoardForm: React.FC = () => {

    // form 에서 입력받을 상태값을 저장할 useState
    const [title, setTitle] = useState('');
    const [writer, setWriter] = useState('');
    const [content, setContent] = useState('');

    // useNavigate() : navigate('path') 는는
    // window.location = 'path'; window.href = 'path' 와 동일하다.
    const navigate = useNavigate();

    const boardSubmit = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        console.log('새 글 등록 : ', { title, writer, content });

        const newBoard = {
            id: Date.now(), // 초단위로 알아서 증가해서 식별용 (임시)
            title,
            writer,
            content
        }
        // 기존의 스토리지에서 읽어 와서 처리
        const boardList = localStorage.getItem('boardList');
        // 스토리지에 값이 있다면 배열로 반환, 아니면 빈 배열로 반환
        const list = boardList ? JSON.parse(boardList) : [];
        list.push(newBoard);
        localStorage.setItem("boardList", JSON.stringify(list));
        alert("저장됐습니다!");
        navigate('/board');
    }

    return (
        <div className={style.container}>
            <h2>글쓰기</h2>
            <form onSubmit={boardSubmit}>
                <table className={style.boardTable}>
                    <tbody>
                        <tr>
                            <th>제목</th>
                            <td><input type="text" name="title" id="title"
                                style={{ width: '95%', padding: '8px' }} onChange={e => { setTitle(e.target.value) }} /></td>
                        </tr>
                        <tr>
                            <th>작성자</th>
                            <td><input type="text" name="writer" id="writer"
                                style={{ width: '95%', padding: '8px' }} onChange={e => { setWriter(e.target.value) }} /></td>
                        </tr>
                        <tr>
                            <th>내용</th>
                            <td><textarea name="content" id="content"
                                style={{ width: '95%', height: '150px', padding: '8px' }} onChange={e => { setContent(e.target.value) }}></textarea></td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th colSpan={2}>
                                <button type="submit" className={style.button}>등록</button>
                                <Link to="/board" className={style.button} style={{ marginLeft: '10px' }}>취소</Link>
                            </th>
                        </tr>
                    </tfoot>
                </table>
            </form>
        </div>
    )
}

export default BoardForm