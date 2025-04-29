import React from 'react'
import Card from './Card'

const ProfileCard: React.FC = () => {
    return (
        <div>
            <Card title='Tess brother' backgroundColor='#4ea04e'>
                <p>안녕하세요, 테스형</p>
                <p>여기는 리액트 프로필 페이지입니다.</p>
            </Card>
        </div>
    )
}

export default ProfileCard