import React from 'react'
import style from './signup.module.css';

const Signup: React.FC = () => {
    return (
        <div className={style.signupContainer}>
            <h2>Signup</h2>
            <form className={style.form}>
                <label>아이디</label>
                <div className={style.inputRow}>
                    <input type="text" name="username" id="username" />
                    <button type='button' className={style.checkButton}>중복확인</button>
                </div>
                <label>이메일</label>
                <input type="email" name="email" id="email" />
                <label>비밀번호</label>
                <input type="password" name="password" id="password" />
                <label>성별</label>
                <div className={style.gender}>
                    <label><input type="radio" name="gender" id="gender" value="남자" />남자</label>
                    <label><input type="radio" name="gender" id="gender" value="여자" />여자</label>
                </div>
                <label>취미</label>
                <div className={style.hobby}>
                    <label><input type="checkbox" name="hobby" id="hobby" value="독서" />독서</label>
                    <label><input type="checkbox" name="hobby" id="hobby" value="운동" />운동</label>
                    <label><input type="checkbox" name="hobby" id="hobby" value="음악" />음악</label>
                </div>
                <label>생년월일</label>
                <input type="date" name="birth" id="birth" />
                <label>국가</label>
                <select name="country" id="country">
                    <option value="">국가 선택</option>
                    <option value="한국">한국</option>
                    <option value="일본">일본</option>
                    <option value="미국">미국</option>
                    <option value="영국">영국</option>
                </select>
                <button type='submit' className={style.submitButton}>가입하기</button>
            </form>
        </div>
    )
}

export default Signup