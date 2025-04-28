import { error } from 'console';
import React, { useState } from 'react'

const Ex1_UseEffectFetch: React.FC = () => {

    const [message, setMessage] = useState('');
    const fetchData = () => {
        console.log("동작");
        fetch(`http://192.168.0.24/reactservice0428/hello.jsp`)
            .then(response => response.json())
            .then(data => {
                setMessage(data.message);
                console.log(`Message : ${data.message}`);
            })
            .catch(error => console.log(`error : ${error}`));
    }
    return (
        <div>
            <button onClick={fetchData}>Fetch Message</button>
            <div>{message ? message : '아직 메세지가 없습니다.'}</div>
        </div>
    )
}

export default Ex1_UseEffectFetch