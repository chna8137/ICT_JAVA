import React from 'react'
import Card from './Card'

const ProductCard: React.FC = () => {
    return (
        <Card title='맥북 프로' backgroundColor='skyblue'>
            {/* 자식 엘리멘트 즉 React.ReactNode => children : React.ReactNode; */}
            <p>Apple의 고성능 노트북입니다.</p>
            <p>가격 : 3,500,000원</p>
        </Card>
    )
}

export default ProductCard