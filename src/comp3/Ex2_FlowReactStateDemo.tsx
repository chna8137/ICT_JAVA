import React, { useState } from 'react'

// 하위 컴포넌트에서 버튼을 반환하도록 선언함
const Child = ({ state, action }: any) => {
    return <button>{state}</button>
}

const Ex2_FlowReactStateDemo: React.FC = () => {
    const [number1, setNumer1] = useState(0);
    const [number2, setNumer2] = useState(0);

    const incrementBtn = () => {
        setNumer1((prev) => prev + 2);
        setNumer2((prev) => prev + 3);
    }

    // 버튼을 클릭할 때 마다 랜더링은 각각 한 번만 일어난다.
    // 2. 하위 컴포넌트로 

    return (
        <div>
            <h2>하위 컴포넌트와 useState</h2>
            {/* 1. 전달할 상위 useState에서 값을 전달할 수 있다. 
                2. 하위 컴포넌트로 한 번에 전달이 가능한다.
            */}
            <Child state={number1} />
            <Child state={number2} />
            <button onClick={incrementBtn}>Change</button>
        </div>
    )
}

export default Ex2_FlowReactStateDemo