import React from 'react'

const Ex1_Type: React.FC = () => {

    // 기본 자료형
    let age: number = 30; // 숫자 정수형
    let score: number = 99.9; // 숫자 실수형
    let name: string = "테스형"; // 문자열
    let isStudent: boolean = false;
    // any 모든 타입을 허용한다. 어떤 값이든 다 받아들인다.
    let variable: any = 100;

    if (score > 90) {
        variable = "멋지십니다.";
    } else {
        variable = 50;
    }


    return (
        <div>
            <h1 style={{ backgroundColor: 'orange', color: 'white' }}>기본 자료형 출력</h1>
            <p>나이 : {age}</p>
            <p>점수 : {score}</p>
            <p>이름 : {name}</p>
            <p>학생 여부 : {isStudent ? '예' : '아니오'}</p>
            <p>변수값 : {variable}</p>
        </div>
    )
}

export default Ex1_Type