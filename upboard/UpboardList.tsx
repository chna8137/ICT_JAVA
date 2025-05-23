import axios from 'axios';
import React, { useEffect, useState } from 'react'
import style from './upboard.module.css'
import { Link } from 'react-router-dom';

// 서버의 값을 받아와서 UI에 반복해서 배치
// 192.168.0.36/myictstudy0521/upboard/upListDemo

// 1. 서버 측으로부터 받아올 UpBoardVo를 json 타입으로 자바스크립트(TypeScript) 인터페이스를 선언
interface UpBoardVO {
    num: number,
    title: string,
    writer: string,
    content: string,
    imgn: string,
    hit: number,
    reip: string,
    bdate: string
}

const UpboardList: React.FC = () => {

    // 2. 서버데이터 JsonArray를 자바스크립트 배열로 저장할 상태값 useState 만들기

    const [upboardList, SetUpboardList] = useState<UpBoardVO[]>([]);

    // 3. 초기화 시 axios를 사용해서 서버측 데이터를 받아와서 useState에 저장하기
    useEffect(() => {

        // 서버에서 목록을 가져오는 함수
        // async () => { await ... }
        const fetchUpboardList = async () => {
            try {
                const response = await axios.get('http://192.168.0.36/myictstudy0521/upboard/upListDemo')
                console.log(response.data);
                SetUpboardList(response.data); // useState에 저장
            } catch (error) {
                console.log("데이터 가져오기 실패 : " + error);
            }
        }
        fetchUpboardList();
    }, []);

    return (
        <div className={style.container}>
            <h2>BoardList</h2>
            <table className={style.boardTable}>
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>이미지</th>
                        <th>조회수</th>
                        <th>작성일</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        upboardList.map((item) => (
                            <tr key={item.num}>
                                <td>{item.num}</td>
                                <td>
                                    {/* BoardDetail.tsx를 라우팅하는 주소 */}
                                    <Link to={`/board/${item.num}`} className={style.titleLink}>{item.title}</Link>
                                </td>
                                <td>{item.writer}</td>
                                <td>{item.imgn}</td>
                                <td>{item.hit}</td>
                                <td>{item.bdate}</td>
                            </tr>
                        ))
                    }
                </tbody>
                <tfoot>
                    <tr>
                        <td colSpan={6} style={{ textAlign: 'center' }}>
                            <Link to="/board/write" className={style.button}>글쓰기</Link>
                        </td>
                    </tr>
                </tfoot>
            </table>
        </div>
    )
}

export default UpboardList