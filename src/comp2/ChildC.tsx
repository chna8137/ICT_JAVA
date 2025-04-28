import React from 'react'
// interface에 컴포넌트가 받을 props의 타입을 정의한다.
// ParentA, ParentB 가 가지고 있는데 데이터 변수를 모두 선언

interface ChildCProps {
    propA: string;
    propB?: string;
    propC: string;
}

// 제네릭을 표현해서 ChildCProps 전용 함수형 컴포넌트 이다.
// 외부에서 전달 받을 값을 지정
// prop : 전달 받은 객체의 주소소
const ChildC: React.FC<ChildCProps> = (prop) => {
    // 넘어온 컴포넌트를 모두 반환
    const { propA, propB, propC } = prop;
    return (
        <div style={{ backgroundColor: 'orange' }}>
            {/* <p>PropA : {propA}</p>
            <p>propB : {propB}</p>
            <p>propC : {propC}</p> */}
            {propA && <p>propA : {propA}</p>}
            {propB && <p>propB : {propB}</p>}
            {propC && <p>propC : {propC}</p>}
        </div>
    )
}

export default ChildC