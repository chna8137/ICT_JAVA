import React, { useState } from 'react'

const Ex3_useStateHook: React.FC = () => {

    // names 상태 State에 업데이트하는 함수
    // const [상태이름, set상태이름] = useState([초기화할 값]);
    // 현재 초기화는 6개 정도의 객체를 가진 배열을 초기값으로 설정한다.
    // let names = [{id : 1, text : "aa"}, .....]
    const [names, setNames] = useState([
        { id: 1, text: '눈사람' },
        { id: 2, text: '얼음' },
        { id: 3, text: '눈' },
        { id: 4, text: '바람' },
        { id: 5, text: '구름' },
        { id: 6, text: '햇살' }
    ]);

    const nameList = names.map(name => (
        <li key={name.id}>{name.text}</li>
    ))
    return (
        <div>
            <ul>{nameList}</ul>
        </div>
    )
}

export default Ex3_useStateHook