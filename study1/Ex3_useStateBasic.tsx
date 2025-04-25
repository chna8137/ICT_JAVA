import { useState } from "react";

// 시나리오 : 10까지 누적한 데이터는 연산 후 랜더링에 반영이 되지만
// 상태변환 : onchange, onclick 등 일 때는 랜더링에 반영이 안된다.

const Ex3_useStateBasic: React.FC = () => {
    let count = 0;
    const [myCount, setMyCount] = useState(0);

    const onClick1 = () => {
        count++;
        console.log(`일반 변수 count => ${count}`)

    };

    const onClick2 = () => {
        setMyCount(myCount + 1);
    };
    return (
        <div>
            <h1>Ex3_useStateBasic</h1>
            <button onClick={onClick1} >click1</button>
            <button onClick={onClick2} >click2</button>
            <ul>
                <li>count : {count}</li>
                {/* 짝수이면 배경색 핑크 아니면 초록 */}
                <li>useState : <input type="text" value={myCount} readOnly style={myCount % 2 === 0 ? { backgroundColor: 'pink' } : { backgroundColor: 'green', color: 'white' }} /></li>
            </ul>
        </div>
    )
}

export default Ex3_useStateBasic
