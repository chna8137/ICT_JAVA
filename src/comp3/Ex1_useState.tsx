// 개념만 이해하자
import React, { useState } from 'react'
import Ex4_Child from './Ex4_Child';

const Ex1_useState: React.FC = () => {

    const [count, setCount] = useState(0);

    return (
        <div>
            <h1>간단하게 useState구조 문법 테스트</h1>
            <button onClick={e => setCount(count + 1)}>증가 시키기</button>
            {/* <p>Count : {count}</p> */}
            <Ex4_Child count={count} />
        </div>
    )
}

export default Ex1_useState