import React, { useEffect, useState } from 'react'
import Ex4_Child from './Ex4_Child';

const Ex4_useEffect: React.FC = () => {

    const [count, setCount] = useState(0);

    // useEffect를 사용해서 콘솔창에 count값 출력하기
    useEffect(() => {
        // console.log(`count : ${count}`);
        document.title = `당신이 클릭한 값 : ${count}`;
    }, [count]);
    return (
        <div>
            <h2>useEffect</h2>
            <Ex4_Child count={count} />
            <p id='target'></p>
            <button onClick={() => setCount(count + 1)}>click</button>
        </div>
    )
}

export default Ex4_useEffect