import React from 'react'
import { Link } from 'react-router-dom'

const Navbar: React.FC = () => {
    return (
        <nav style={{ marginTop: '10px' }}>
            <Link to="/" style={{ marginRight: '10px' }}>HOME</Link>
            <Link to="/board" style={{ marginRight: '10px' }}>게시판</Link>
            <Link to="/gallary" style={{ marginRight: '10px' }}>갤러리</Link>
            <Link to="/chart" style={{ marginRight: '10px' }}>차트</Link>
            <Link to="/community" style={{ marginRight: '10px' }}>커뮤니티</Link>
            <Link to="/diary">일기장</Link>
        </nav>
    )
}

export default Navbar