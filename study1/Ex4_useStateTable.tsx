import { STATUS_CODES } from 'http';
import React, { useState } from 'react'

const Ex4_useStateTable: React.FC = () => {

    const [name, setName] = useState('');
    const [age, setAge] = useState('');
    const [gender, setGender] = useState('');
    const [people, setPeople] = useState<any[]>([]);
    const addPerson = () => {
        if (name && age && gender) {
            console.log(`Button이 클릭이 되었을 때 ${name}, ${age}, ${gender}`);
            // useState에 입력된 name, age, gender 저장할 객체를 생성한다.
            const newPerson = {
                name, age, gender
            }

            console.log(`newPerson => ${newPerson.name}`);
            // 기존에 저장된 useState 값 즉, people에 새로운 newPerson값을 누적한다.
            setPeople([...people, newPerson]);
            setName("");
            setAge("");
            setGender("");


        } else {
            console.log("값이 없다.");
        }
    }

    const nameChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        console.log(`Name => ${e.target.value}`);
        setName(e.target.value);
    }

    const ageChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        console.log(`Age => ${e.target.value}`);
        setAge(e.target.value);
    }

    const genderChange = (e: React.ChangeEvent<HTMLSelectElement>) => {
        console.log(`Gender => ${e.target.value}`);
        setGender(e.target.value);

    }

    return (
        <div>
            <input type="text" placeholder='이름을 입력하세요' onChange={nameChange} />
            <input type="number" placeholder='20' onChange={ageChange} />
            <select onChange={genderChange}>
                <option value="">성별 선택</option>
                <option value="남자">남자</option>
                <option value="여자">여자</option>
            </select>
            <button onClick={addPerson}>추가</button>
            <table style={{ borderCollapse: 'collapse', width: '100%' }}>
                <thead>
                    <tr style={{ border: '1px solid black' }}>
                        <th>이름</th>
                        <th>나이</th>
                        <th>성별</th>
                    </tr>
                </thead>
                <tbody>
                    {/* 데이터를 출력하시고, 만약 남자는 푸른색, 여자는 핑크색 계열로 스타일을 표현하시오. */}
                    {people.map((e, idx) => (
                        <tr key={idx} style={e.gender === '남자' ? { backgroundColor: 'skyblue' } : { backgroundColor: 'pink' }}>
                            <td>{e.name}</td>
                            <td>{e.age}</td>
                            <td>{e.gender}</td>
                        </tr>
                    ))
                    }
                </tbody>

            </table>
        </div>
    )
}

export default Ex4_useStateTable