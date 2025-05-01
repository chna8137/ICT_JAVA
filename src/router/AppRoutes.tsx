import React from 'react'
import Home from '../conts/Home'
import BoardList from '../conts/board/BoardList'
import BoardForm from '../conts/board/BoardForm'
import BoardDetail from '../conts/board/BoardDetail'
import Gallery from '../conts/gallery/Gallery'
import Community from '../conts/Community'
import Diary from '../conts/Diary'
import Login from '../conts/Login'
import Signup from '../conts/member/Signup'
import Chart from '../conts/Chart'
import GalleryForm from '../conts/gallery/GalleryForm'
import GalleryDetail from '../conts/gallery/GalleryDetail'
import { Route, Routes } from 'react-router-dom'

const AppRoutes: React.FC = () => {

    const routeList = [
        { path: '/', element: <Home /> },
        { path: '/board', element: <BoardList /> },
        { path: '/board/write', element: <BoardForm /> },
        { path: '/board/:id', element: <BoardDetail /> },
        { path: '/gallery', element: <Gallery /> },
        { path: '/gallery/write', element: <GalleryForm /> },
        { path: '/gallery/:id', element: <GalleryDetail /> },
        { path: '/chart', element: <Chart /> },
        { path: '/community', element: <Community /> },
        { path: '/diary', element: <Diary /> },
        { path: '/login', element: <Login /> },
        { path: '/signup', element: <Signup /> },
    ]
    return (
        <Routes>
            {
                routeList.map((route, idx) => (
                    <Route key={idx} {...route} />
                ))
            }
        </Routes>
    )
}

export default AppRoutes