import React from 'react'

interface CardProps {
    title?: string;
    backgroundColor?: string;
    // React 안에서 "렌더링할 수 있는 모든 것"**을 의미하는 타입
    children: React.ReactNode;
}

const Card: React.FC<CardProps> = ({ title, backgroundColor, children }) => {
    return (
        <div style={{
            margin: 8, padding: 8, borderRadius: 8, boxShadow: "0px 0px 4px grey",
            backgroundColor: backgroundColor || "white"
        }}>
            {title && <h1>{title}</h1>}
            {/* {childredn} 상위 컴포넌트에서 전달해주는 엘리멘트 */}
            {children}
        </div>
    )
}

export default Card