/*
React 해당 객체를 사용해서 FC(Funtion) 형식으로 객체를 관리
*/
import React from "react";
// 사용할 변수를 interface를 사용해서 선언
interface Item {
    // 외부에서 들어온 값을 받아서 쓰고 싶어서 인퍼페이스를 만듦
    // number란 자료형으로 선언할 수 있다.
    // java처럼 자료형을 선언해줄 수 있다.
    // 변수 : 자료형
    id: number;
    text: string;
} // 자바의 VO객체 같은 거...

// funtion App() { return ("<요소></요소>")} -> JSX문법
const Ex1Sample: React.FC = () => {
    const items: Item[] = [
        { id: 1, text: '첫번째' },
        { id: 2, text: '두번째' },
        { id: 3, text: '세번째' },
    ];
    return (
        <div>
            <h2>항목 리스트</h2>
            <ul>
                { // jsx 문법 영역 = jsp의 <%%>과 동일
                    items.map((item) => (<li key={item.id}>{item.text}</li>)) // {item.text} = <%=item.text %>
                }
            </ul>
        </div>
    );
}

export default Ex1Sample;