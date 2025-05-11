import React, { useState } from 'react'
import style from './signup.module.css';

const Login: React.FC = () => {
    const [id, setId] = useState('');
    const [password, setPassword] = useState('');

    const [loginChecked, setLoginChecked] = useState(false); // 로그인 중복 체크
    const imsiUsers = [
        { id: 'admin', password: '111111' },
        { id: 'tess', password: '222222' },
        { id: 'ictuser', password: '333333' }
    ];

    const checkLogin = () => {
        console.log(`id값 => ${id.trim()}`);

        if (!id.trim() || !password.trim()) {
            alert("아이디 혹은 비밀번호를 입력하세요");
            return;
        }

        const user = imsiUsers.find(
            (user) => user.id === id.trim().toLowerCase() && user.password === password.trim()
        );

        if (user) {
            alert("로그인이 성공하였습니다.");
            setLoginChecked(true);  // 로그인 성공 상태
        } else {
            alert("로그인 정보가 일치하지 않습니다.");
            setLoginChecked(false); // 실패 상태
        }
    };

    return (
        <div>
            <h2>Login</h2>
            <div className={style.signupContainer}>
                <form className={style.form}>
                    <div className={style.login}>
                        <input className={style.input} type="text" name="id" id="id" placeholder='아이디' onChange={e => { setId(e.target.value) }} />
                        <input className={style.input} type="password" name="password" id="password" placeholder='비밀번호' onChange={e => setPassword(e.target.value)} />
                        <button type='button' className={style.loginButton} onClick={checkLogin}>로그인</button>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default Login