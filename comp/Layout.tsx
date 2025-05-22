import React from 'react'
import Navbar from './Navbar';

interface LayoutProps {
    children: React.ReactNode;
}

const Layout: React.FC<LayoutProps> = ({ children }) => {
    return (
        <div style={{ maxWidth: '1200px', margin: '0 auto', padding: '20px' }}>
            <header style={{
                display: 'flex',
                justifyContent: 'space-between', // 공간을 사이로 벌려놓기
                alignItems: 'center', //중앙 정렬
                backgroundColor: '#B0E0B0',
                color: 'white',
                padding: '10px 20px',
                borderRadius: '8px'
            }}>
                <h1>ICT Password</h1>
                <div>
                    <a href="/login" style={{ marginRight: '10px', color: 'white' }}>로그인</a>
                    <a href="/signup" style={{ color: 'white' }}>회원가입</a>
                </div>
            </header>
            <Navbar />
            <main>{children}</main>
            <footer style={{
                backgroundColor: '#B4B4FF',
                color: '#F9FFFF',
                padding: '10px',
                borderRadius: '0 0 8px 8px',
                textAlign: 'center'
            }}>
                @ 2025 IctPassword.
            </footer>
        </div>
    )
}

export default Layout