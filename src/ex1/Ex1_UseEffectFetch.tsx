import React, { useEffect, useState } from 'react'

// Geo를 포함함
interface Geo {
    lat: string;
    lng: string;
}

interface Address {
    street: string;
    suite: string;
    city: string;
    zipcode: string;
    geo: Geo; // geo 변수의 자료형은 interface인 Geo이다.
}

interface Company {
    name: string;
    catchPhrase: string;
    bs: string;
}

interface UserData {
    id: number;
    name: string;
    username: string;
    email: string;
    address: Address;
    phone: string;
    website: string;
    company: Company;
}

const Ex1_UseEffectFetch: React.FC = () => {
    // Interface인 UserData전용 useState 훅을 선언
    // | (파이프 하나) - 타입을 여러 개 중 하나로 허용하겠다는 뜻
    const [userData, setUserData] = useState<UserData | null>(null);
    // 데이터가 많거나, 로딩이 생길 수 있다.
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        // fetch를 사용하면서 useState에 값을 저장
        /* const fetchUserData = async () => {}; 비동기 함수
            await 키워드를 사용하여 비동기 작업이 완료될 때까지 기다리게 한다.
        */
        const fetchUserData = async () => {
            setLoading(true);
            const response = await fetch('https://jsonplaceholder.typicode.com/users/1');
            // 마찬가지로 await 때문에 변환이 끝날 때까지 대기한다.
            const data = await response.json();
            setUserData(data);
            setLoading(false);
        };
        // 함수 호출
        fetchUserData();
    }, []);
    if (loading) {
        return <div>로딩중~!</div>
    }

    return (
        <div>
            <h1>Ex1_UseEffectFetch</h1>
            {userData ? (
                <>
                    <p>Name : {userData.name}</p>
                    <p>UserName : {userData.username}</p>
                    <p>Email : {userData.email}</p>
                    <p>Address : {userData.address.street}, {userData.address.suite},
                        {userData.address.city}, {userData.address.zipcode}</p>
                    <p>Company : {userData.company.name} - {userData.company.catchPhrase}</p>
                    <p>Phone : {userData.phone}</p>
                    <p>Website : {userData.website}</p>
                </>
            ) : (<p>데이터가 없어요!</p>)}
        </div>
    )
}

export default Ex1_UseEffectFetch