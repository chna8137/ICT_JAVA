import React, { useState } from 'react'

const Ex1_LocalStorage: React.FC = () => {

    const [msg, setMsg] = useState('');
    // deleteLocalStorage()호출했을 때와, saveLocalStorage를 구분해서
    // storedMsg에 처리를 하겠다.
    const [storedMsg, setStoredMsg] = useState<string | null>('');

    const saveLocalStorage = () => {
        localStorage.setItem("msg", msg);
        setStoredMsg(msg);
    }
    const deleteLocalStorage = () => {
        localStorage.removeItem("msg");
        setStoredMsg(null);
    }

    return (
        <div>
            <input type="text" name="msg" id="msg" onChange={e => setMsg(e.target.value)} />
            <button onClick={saveLocalStorage}>저장</button>
            <button onClick={deleteLocalStorage}>삭제</button>
            <p>{storedMsg}</p>
        </div>
    )
}

export default Ex1_LocalStorage