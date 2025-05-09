import React from 'react'
import style from './signup.module.css';

const Login: React.FC = () => {
    return (
        <div>
            <h2>Login</h2>
            <div className={style.signupContainer}>
                <div className={style.login}>
                    <input className={style.input} type="text" name="id" id="id" placeholder='아이디' />
                    <input className={style.input} type="password" name="password" id="password" placeholder='비밀번호'/>
                    <button type='button' className={style.loginButton}>로그인</button>
                </div>
            </div>
        </div>
    )
}

export default Login