import React, { useState } from 'react'
import style from './signup.module.css';

const Signup: React.FC = () => {

    // 회원의 데이터를 저장할 useState
    const [form, setForm] = useState({
        username: '',
        email: '',
        password: '',
        gender: '',
        hobby: [] as string[], // string 배열이라고 as string[]으로 명시해준 것
        birth: '',
        country: ''
    });

    // 초기값이 객체고, 그 객체의 타입을 명시해주기 위해" 사용
    // string 타입의 키와 string 값을 가지는 객체를 초기값으로 갖는 에러 상태 (예: { username: "에러메시지" })
    const [errors, setErrors] = useState<{ [key: string]: string }>({});
    const [idChecked, setIdChecked] = useState(false); // 아이디 중복 체크

    // 유효성을 체크하는 함수 정의
    const validate = () => {
        const newErrors: { [key: string]: string } = {};
        // 값이 비었을 때 실행하겠다"
        if (!form.username) {
            newErrors.username = '아이디를 입력하세요';
        }
        if (!idChecked) {
            newErrors.idCheck = '아이디 중복확인은 필수 입니다.';
        }
        if (!form.email) {
            newErrors.email = '이메일을 입력하세요';
        }
        if (!form.password || form.password.length < 6) {
            newErrors.password = '비밀번호는 최소 6자 이상이어야 합니다.';
        }
        if (!form.gender) {
            newErrors.gender = '성별을 선택하세요';
        }
        if (!form.hobby.length) {
            newErrors.hobby = '하나 이상의 취미를 선택하세요';
        }
        if (!form.birth) {
            newErrors.birth = '생년월일을 입력하세요';
        }
        if (!form.country) {
            newErrors.country = '국가를 선택하세요';
        }

        return newErrors;
    }


    const imsiUserid = ['admin', 'tess', 'ictuser']; // 임시 회원아이디

    const memberChange = (e: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>) => {
        // 구조 분해 할당 e.target.name, e.target.value, e.target.type 각각 꺼내서 변수처럼 바로 쓰겠다는 뜻
        const { name, value, type } = e.target;
        // type이 checkbox일 경우
        if (type === 'checkbox') {
            console.log("Checkbox입니다.");
            // checked 된 값
            let checked = (e.target as HTMLInputElement).checked;
            console.log(`Checked => ${checked} : ${value}`);
            // FilterTest.tsx에 구현해놨으니 참고할 것!
            console.log({ [name]: checked ? value : [name].filter(h => h !== value) });
            // (checked === true) : 값에 value를 추가. ["독서"] + "운동" => ["독서", "운동"]
            // (checked === false) : filter를 사용해서 "운동" 해제 했다면 => ["독서"]
            setForm(prev => ({ ...prev, hobby: checked ? [...prev.hobby, value] : prev.hobby.filter(h => h !== value) }))
        } else {
            console.log("Checkbox가 아닙니다");
            console.log(`name => ${name}, value => ${value}`);
            // change 이벤트가 발생할 때 회원의 정보를 저장하는 객체를
            // useState 즉 form에 저장하기 위해서 setForm호출해서 값을 저장한다.

            // ...prev는 이전까지 입력한 값들을 복사해두는 저장본이고, [name]: value로 현재 입력값만 덮어써서 전체 상태를 최신화함
            setForm(prev => ({ ...prev, [name]: value }));
        }
    }

    // 아이디 중복 검사 실행
    const checkUsername = () => {
        console.log(`id값 => ${form.username.trim()}`);
        if (!form.username.trim()) {
            alert("아이디를 입력하세요");
            return;
        }
        // 이 부분은 백엔드 시 변경될 예정
        console.log(`IdCheck => ${imsiUserid.includes(form.username.trim().toLowerCase())}`);
        if (imsiUserid.includes(form.username.trim().toLowerCase())) {
            alert("이미 존재하는 아이디 입니다.");
            setIdChecked(false);
        } else {
            alert("사용 가능한 아이디 입니다")
            setIdChecked(true);
        }
    }

    // 회원가입 버튼 이벤트 핸들링
    const signupSubmit = (e: React.FormEvent) => {
        e.preventDefault();
        alert("회원가입 성공!");
        // 유효성 검사
        const myErrors = validate();
        // Object.keys() : 객체의 key들만 꺼내서 배열로 바꿔주는 함수
        // myErrors 객체 안에 키가 하나라도 있다면 → 유효성 검사에 걸린 것이 있다는 의미
        if (Object.keys(myErrors).length > 0) {
            console.log(Object.keys(myErrors));
            setErrors(myErrors);
        } else {
            // 서버로 전송
            console.log("선택한 취미들 :", form.hobby);
        }

    }

    return (
        <div className={style.signupContainer}>
            <h2>Signup</h2>
            <form className={style.form} onSubmit={signupSubmit}>
                <label>아이디</label>
                <div className={style.inputRow}>
                    <input type="text" name="username" id="username" onChange={memberChange} />
                    <button type='button' className={style.checkButton} onClick={checkUsername}>중복확인</button>
                </div>
                {/* errors.username : validate() 호출 할 때 useState form에 있는 속성 중
                    값이 없을 때 메세지를 저장한 키값을 만들어진다. */}
                {errors.username && <p className={style.error}>{errors.username}</p>}
                {errors.idCheck && <p className={style.error}>{errors.idCheck}</p>}
                <label>이메일</label>
                <input type="email" name="email" id="email" onChange={memberChange} />
                {errors.email && <p className={style.error}>{errors.email}</p>}
                <label>비밀번호</label>
                <input type="password" name="password" id="password" onChange={memberChange} />
                {errors.password && <p className={style.error}>{errors.password}</p>}
                <label>성별</label>
                <div className={style.gender}>
                    <label><input type="radio" name="gender" value="남자" onChange={memberChange} />남자</label>
                    <label><input type="radio" name="gender" value="여자" onChange={memberChange} />여자</label>
                </div>
                {errors.gender && <p className={style.error}>{errors.gender}</p>}
                <label>취미</label>
                <div className={style.hobby}>
                    <label><input type="checkbox" name="hobby" value="독서" onChange={memberChange} />독서</label>
                    <label><input type="checkbox" name="hobby" value="운동" onChange={memberChange} />운동</label>
                    <label><input type="checkbox" name="hobby" value="음악" onChange={memberChange} />음악</label>
                </div>
                {errors.hobby && <p className={style.error}>{errors.hobby}</p>}
                <label>생년월일</label>
                <input type="date" name="birth" id="birth" onChange={memberChange} />
                {errors.birth && <p className={style.error}>{errors.birth}</p>}
                <label>국가</label>
                <select name="country" id="country" onChange={memberChange}>
                    <option value="">국가 선택</option>
                    <option value="한국">한국</option>
                    <option value="일본">일본</option>
                    <option value="미국">미국</option>
                    <option value="영국">영국</option>
                </select>
                {errors.country && <p className={style.error}>{errors.country}</p>}
                <button type='submit' className={style.submitButton}>가입하기</button>
            </form>
        </div>
    )
}

export default Signup