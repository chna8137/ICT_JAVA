import React, { useState } from 'react'

const Ex3_useStateHookEvent: React.FC = () => {
    const [names, setNames] = useState([
        { id: 1, text: '눈사람' },
        { id: 2, text: '얼음' },
        { id: 3, text: '눈' },
        { id: 4, text: '바람' },
        { id: 5, text: '구름' },
        { id: 6, text: '햇살' }
    ]);

    // 입력값을 저장할 상태 변수 선언
    const [inputText, setInputText] = useState('');
    // 새롭게 추가될 id값을 부여할 상태 변수 선언언
    const [nextId, setNextId] = useState(7);

    const nameList = names.map(name => (
        <li key={name.id}>{name.text}</li>
    ))

    // Event funtion 처리하기
    // 해당 DOM에 변화가 발생했을 때 onChange란 속성에 의해서 이벤트 처리하기
    // 위한 아래의 함수가 호출되고, 클릭도 마찬가지
    // 입력 창에 값이 테스형 -> setInputText("테스형") -> useState("inputText")에 저장
    const onChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        console.log("change!");
        console.log(`onChange => ${e.target.value}`); // e.target = input text를 의미 e(들어있는).target(객체)

        // 상태 관리 변수 useState 저장해보기
        setInputText(e.target.value);
    }

    // useState에서 입력된 테스형 즉 inputText를 가져와서
    // id를 기억하는 state를 사용해서 1씩 증가해서
    // 결국 names란 useState에 Object형식으로 만들어서 배열에 저장!
    const onClick = () => {
        console.log("clicked!" + inputText);
        const nextNames = names.concat({
            id: nextId,
            text: inputText
        });

        // ID 증가
        setNextId(nextId + 1); // nextId값에 1을 더해준다
        setNames(nextNames); // 새로운 객체가 업데이트 된다
        setInputText(''); // 기존의 input값을 초기화
    }
    return (
        <div>
            <input type="text" onChange={onChange} />
            <button onClick={onClick}>추가</button>
            <ul>{nameList}</ul>
        </div>
    )
}

export default Ex3_useStateHookEvent