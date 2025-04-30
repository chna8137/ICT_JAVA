import React from 'react'
import style from './board.module.css'
import { Link } from 'react-router-dom'

const BoardForm: React.FC = () => {
    return (
        <div className={style.container}>
            <h2>글쓰기</h2>
            <form>
                <table className={style.boardTable}>
                    <tbody>
                        <tr>
                            <th>제목</th>
                            <td><input type="text" name="title" id="title"
                                style={{ width: '100%', padding: '8px' }} /></td>
                        </tr>
                        <tr>
                            <th>작성자</th>
                            <td><input type="text" name="writer" id="writer"
                                style={{ width: '100%', padding: '8px' }} /></td>
                        </tr>
                        <tr>
                            <th>내용</th>
                            <td><textarea name="content" id="content"
                                style={{ width: '100%', height: '150px', padding: '8px' }}></textarea></td>
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