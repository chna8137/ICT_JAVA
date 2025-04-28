import React from 'react'

interface Props {
    count: number;
}

const Ex4_Child: React.FC<Props> = (count) => {
    // count라는 객체 안에서 count라는 프로퍼티를 꺼내고, 그걸 cnt라는 이름으로 사용
    // props로 받은 객체 {count:number}에서 count를 꺼내서 cnt라는 새로운 변수에 저장
    const { count: cnt } = count;

    return (
        <div>
            <h3 style={{ backgroundColor: 'orange' }}>
                {/* 자식 컴포넌트에서 받은 count : {cnt} / {count} */}
                자식 컴포넌트에서 받은 count : {cnt}
            </h3>
        </div>
    )
}

export default Ex4_Child