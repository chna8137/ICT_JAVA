import React, { useMemo, useState } from 'react'

const Ex1_useMemo: React.FC = () => {

    // useState 선언
    const [count, setCount] = useState(0);
    const [text, setTest] = useState('');

    // count를 증가시키는 함수
    const memoTotal = (n: number) => {
        console.log("memoTotal() 계산 실행됨!");
        let total = 0;
        for (let i = 0; i < 100000000; i++) {
            total += i;
        }
        return total + n;
    };

    // useMemo를 사용해서 계산 결과를 저장
    // [count] count가 변경될 때 마다 useMemo의 익명함수를 다시 실행한다.
    const momoResult = useMemo(() => {
        console.log("useMemo 다시 계산됨");
        return memoTotal(count);
    }, [count]);
    // const onChange = (e: React.ChangeEvent<HTMLInputElement>) => {}

    return (
        <div>
            <h2>useMomoBasic</h2>
            <input type="text" value={text} onChange={e => {
                setTest(e.target.value);
                console.log("************************");
            }} />
            <p>입력 값 : {text}</p>
            <button onClick={() => setCount(p => p + 1)}>count</button>
            <p>현재 count : {count}</p>
            <hr />
            <p style={{ backgroundColor: '#e0f7fa' }}>
                <strong>useMemo 결과 : {momoResult}</strong>
            </p>
            <p style={{ backgroundColor: '#fff7fa' }}>
                <strong>그냥 호출한 결과 : {memoTotal(count)}</strong>
            </p>
        </div>
    )
}

export default Ex1_useMemo