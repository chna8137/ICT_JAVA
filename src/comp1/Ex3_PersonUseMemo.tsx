import React, { useMemo, useState } from 'react'

const Ex3_PersonUseMemo: React.FC = () => {

    const [name, setName] = useState('');
    const [age, setAge] = useState('');
    const [ssn, setSsn] = useState('');
    const [email, setEmail] = useState('');
    const [phone, setPhone] = useState('');
    const [people, setPeople] = useState<any[]>([]);
    const [nextId, setNextId] = useState(1);
    const [chcolor, setChcolor] = useState(false);
    const [bgcolors, setBgcolors] = useState('orange');

    // Form에 submit 버튼이 클릭 되었을 때 처리하는 이벤트 onSubmit 처리
    const sendSubmit = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault(); // 폼의 전송을 막음
        console.log(`submit 버튼이 클릭 됨 ${name} ${age}`);
        console.log(`==> ${ssn} ${email} ${phone}`)
        // 객체 생성 newPerson 생성해서, people에 저장한다.
        // nextId에도 1씩 증가
        const newPerson = {
            id: nextId, name, age, ssn, email, phone
        }
        setPeople([...people, newPerson]);
        setNextId(nextId + 1);
        setAge('');
        setSsn('');
        setEmail('');
        setPhone('');
    }

    const peopleRows = useMemo(() => {
        console.log("people map useMemo 적용됨!");
        setChcolor(true);
        return people.map((e) => (
            <tr key={e.id} style={{ textAlign: 'center' }}>
                <td style={{ border: '1px solid #ddd', padding: '8px' }}>{e.name}</td>
                <td style={{ border: '1px solid #ddd', padding: '8px' }}>{e.age}</td>
                <td style={{ border: '1px solid #ddd', padding: '8px' }}>{e.ssn}</td>
                <td style={{ border: '1px solid #ddd', padding: '8px' }}>{e.email}</td>
                <td style={{ border: '1px solid #ddd', padding: '8px' }}>{e.phone}</td>
            </tr>
        ))
    }, [people]);

    // // React.ChangeEvent<HTMLInputElement>
    // const changeData = (e: React.ChangeEvent<HTMLInputElement>) => {
    //     setBgcolors(e.target.value);
    // }

    return (
        <div style={{ maxWidth: '600px', margin: '30px auto', backgroundColor: bgcolors }}>
            {/* onSubmit 이벤트는 폼이 전송될 때 동작하는 이벤트 */}
            <form onSubmit={sendSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '10px', marginBottom: '20px' }}>
                <input type="text" value={name} onChange={e => setName(e.target.value)} placeholder='이름' />
                <input type="number" value={age} onChange={e => setAge(e.target.value)} placeholder='나이' />
                <input type="text" value={ssn} onChange={e => setSsn(e.target.value)} placeholder='주민번호 앞 6자리 + 뒤 1자리' pattern='\d{7}' />
                <input type="email" value={email} onChange={e => setEmail(e.target.value)} />
                <input type="tel" value={phone} onChange={e => setPhone(e.target.value)} placeholder='전화번호' />
                <button type='submit' style={{ backgroundColor: 'skyblue', border: 'none', padding: '10px', cursor: 'pointer' }}>추가</button>
            </form>
            <table style={{ width: '100%', borderCollapse: 'collapse' }}>
                <thead>
                    <tr style={{ backgroundColor: 'pink', color: '#fff' }}>
                        <th style={{ border: '1px solid #ddd', padding: '8px' }}>이름</th>
                        <th style={{ border: '1px solid #ddd', padding: '8px' }}>나이</th>
                        <th style={{ border: '1px solid #ddd', padding: '8px' }}>주민번호</th>
                        <th style={{ border: '1px solid #ddd', padding: '8px' }}>이메일</th>
                        <th style={{ border: '1px solid #ddd', padding: '8px' }}>연락처</th>
                    </tr>
                </thead>
                <tbody style={{ backgroundColor: chcolor ? 'red' : 'white', transition: 'background-color 0.5s' }}>
                    {peopleRows}
                </tbody>
                <tfoot>
                    <tr style={{ backgroundColor: 'pink', color: '#fff' }}>
                        <th colSpan={5}>
                            <input type="color" onChange={e => {
                                setBgcolors(e.target.value);
                            }} />
                        </th>
                    </tr>
                </tfoot>
            </table>
        </div>
    )
}

export default Ex3_PersonUseMemo