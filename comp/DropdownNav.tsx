import React, { useRef, useState } from 'react'
import style from './Navbar.module.css';
import { NavLink } from 'react-router-dom';

const DropdownNav: React.FC = () => {

    // true, false에 따라서 드랍다운 여부를 결정하기 위한 상태값
    const [isOpen, setIsOpen] = useState(false); // / 처음에는 닫힌 상태(false)로 시작

    // dom 요소에 접근할 useRef
    const dropdownRef = useRef<HTMLDivElement>(null);

    // toggleDropdown 클릭이 될 때 useState 값에 toggle처리를 한다.
    // 이전 상태(prev)를 받아서 반대로 바꿈 → true면 false, false면 true
    const toggleDropdown = () => { setIsOpen((prev) => !prev) }
    const closeDropdown = () => { setIsOpen(false) }

    // active 스타일을 함수적으로 제어
    // 구조 분해로 isActive만 꺼냄
    // 이 구조 자체의 타입은 { isActive: boolean }
    const linkClass = ({ isActive }: { isActive: boolean }) =>
        // 삼항 연산자 사용:
        // isActive가 true면 두 클래스를 공백으로 이어 붙임
        // 아니면 기본 스타일만 반환
        isActive ? `${style.link} ${style.active}` : style.link

    return (
        <div ref={dropdownRef} className={style.dropdown}>
            <div onClick={toggleDropdown} className={style.link}>커뮤니티
                <span className={style.arrow}>{isOpen ? '▲' : '▼'}</span>
            </div>
            {isOpen && (
                <div className={style.dropdownContent}>
                    <NavLink to="" onClick={closeDropdown} className={linkClass}>자유게시판</NavLink>
                    <NavLink to="/community/uplist" onClick={closeDropdown} className={linkClass}>UpBoard</NavLink>
                    <NavLink to="" onClick={closeDropdown} className={linkClass}>설문조사</NavLink>
                </div>
            )}

        </div>
    )
}

export default DropdownNav