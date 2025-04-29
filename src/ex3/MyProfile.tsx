import React, { useEffect, useState } from 'react'
import Layout from './Layout';

interface MyInfo {
    name?: string;
    age?: number;
}

const MyProfile: React.FC<MyInfo> = () => {
    const [myinfo, setMyinfo] = useState({
        name: '',
        age: 0
    });
    useEffect(() => {
        setMyinfo({
            name: '테스형',
            age: 20
        })
    }, []);
    return (
        <Layout>
            <h2>여기는 {myinfo.name}님 마이페이지</h2>
            <p>나의 나이는 {myinfo.age}</p>
        </Layout>
    )
}

export default MyProfile