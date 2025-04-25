import React from 'react'

const Ex2_Type_Complex: React.FC = () => {

    // 배열 자료형
    const numbers: number[] = [10, 20, 300, 500, 600];

    // 자바에서 사용했던 제네릭 : 컬렉션을 생성할 때 특정 객체 전용으로 생성
    // List<String> arr = new ArrayList<>();
    // Array<자료형> : 전용배열 이기 때문에 오직 string만 들어와야함
    const fruits: Array<string> = ["Apple", "Banana", "Cheery"];

    // tuple : 나열한 자료형에 맞게 값을 할당해야 한다.
    // const person : [string, number, boolean] = [25, true, "테스형"]; x
    const person: [string, boolean, number] = ["테스형", true, 25];

    // enum : 열거형 객체
    enum Mycolor { Red, Green, Blue, Pink, Orange }
    let col: Mycolor = Mycolor.Orange

    // interface : 마치 pojo, map을 연상하게 됨
    interface Car {
        brand: string,
        model: string,
        price: number
    }
    // 해당 Object 자료형이 미리 선언한 interface라면
    // 반드시 재정의 해서 구현해야 한다.
    // 쉽게 => interface를 재정의한 -> 반드시 object가 값을 대입해서 사용해야 한다.
    const myCar: Car = {
        brand: "현대자동차",
        model: "그랜다이저",
        price: 9000

    }

    return (
        <div>
            <h1 style={{ backgroundColor: 'orange', color: 'white' }}>복합 자료형 출력</h1>
            <h2>Array</h2>
            {/* 10, 20, 300, 500, 600 */}
            <p>{numbers.join(", ")}</p>
            <p>Fruits : {fruits.join(", ")}</p>
            <p>Person : {person[0]}, 나이 : {person[1]}
                학생여부 : {person[2] ? "예" : "아니오"}</p>
            <h2>Tuple</h2>
            <h2>Enum</h2>
            <p>내가 선택한 색상 {col} / {Mycolor[col]}</p>
            <h2>Interface를 구현한 객체</h2>
            <p>My Car : {myCar.brand}의 {myCar.model}입니다. 가격은 {myCar.price}원 입니다.</p>

        </div>
    )
}

export default Ex2_Type_Complex