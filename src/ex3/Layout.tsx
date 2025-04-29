import React from 'react'
import { updateTypePredicateNodeWithModifier } from 'typescript';

interface LayoutProps {
    children: React.ReactNode;
}

const Layout: React.FC<LayoutProps> = ({ children }) => {
    return (
        <div style={{
            maxWidth: '1200px',
            margin: '0 auto',
            padding: '20px',
            border: '2px solid #ddd',
            borderRadius: '8px'
        }}>
            <header style={{
                backgroundColor: '#8EE1D2',
                color: 'white',
                padding: '10px',
                borderRadius: '8px 8px 0 0'
            }}><h1>ICT Password</h1></header>
            <main>{children}</main>
            <footer style={{
                backgroundColor: '#FDE6BE',
                color: 'white',
                padding: '10px',
                borderRadius: ' 0 0 8px 8px',
                textAlign: 'center'
            }}>
                @ 2025 IctPassword.
            </footer>

        </div>
    )
}

export default Layout