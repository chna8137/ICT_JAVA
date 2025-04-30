import React from 'react'
import style from './board.module.css'
import { useParams } from 'react-router-dom'
import { boardList } from './boardData';
import { Link } from 'react-router-dom';

const BoardDetail: React.FC = () => {

    // path 에서 전달되어 온 값을 받아서 처리해주는 Hook
    // useParams()
    // <Route path = '/board/:id => {id}
    // 파라미터를 받아서 변수에 저장하기 위함 *****
    const { id } = useParams<{ id: string }>();


    const details = boardList.find(item => item.id === Number(id));
    console.log(details);
    return (
        <div className={style.container}>
            <h2>게시글 상세내용</h2>
            <table className={style.boardTable}>
                <tbody>
                    <tr>
                        <th>제목</th>
                        {/* ? : 있던 없던 실행해라 */}
                        <td>{details?.title}</td>
                    </tr>
                    <tr>
                        <th>작성자</th>
                        <td>{details?.writer}</td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td>{details?.content}</td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colSpan={2} style={{ textAlign: 'center' }}>
                            <Link to="/board" className={style.button}>목록</Link>
                        </td>
                    </tr>

                </tfoot>
            </table>
        </div>
    )
}

export default BoardDetail