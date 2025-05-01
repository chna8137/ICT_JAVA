import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Layout from './comp/Layout';
import Login from './conts/Login';
import Signup from './conts/member/Signup';
import Home from './conts/Home';
import BoardList from './conts/board/BoardList';
import BoardDetail from './conts/board/BoardDetail';
import BoardForm from './conts/board/BoardForm';
import Gallery from './conts/gallery/Gallery';
import Chart from './conts/Chart';
import Community from './conts/Community';
import Diary from './conts/Diary';
import AppRoutes from './router/AppRoutes';
import Ex1_LocalStorage from './ex1_storage/Ex1_LocalStorage';
import Ex2_LocalStorage from './ex1_storage/Ex2_LocalStorage';

function App() {
  return (
    // <Router> {/* 전체 라우팅 시스템의 루트(최상단) */}
    //   <Layout>
    //     <Routes> {/* 여러개의 Route를 묶는 컨테이너(부모) 역할 */}
    //       <Route path='/login' element={<Login />} />
    //       <Route path='/signup' element={<Signup />} />
    //       <Route path='/' element={<Home />} /> {/* 각각 path와 연결된 컴포넌트를 정의 */}
    //       <Route path='/board' element={<BoardList />} />
    //       <Route path='/board/:id' element={<BoardDetail />} />
    //       <Route path='/board/write' element={<BoardForm />} />
    //       <Route path='/gallary' element={<Gallery />} />
    //       <Route path='/chart' element={<Chart />} />
    //       <Route path='/community' element={<Community />} />
    //       <Route path='/diary' element={<Diary />} />
    //     </Routes>
    //   </Layout>
    // </Router>

    <Router>
      <Layout>
        <AppRoutes />
      </Layout>
    </Router>

    // <Ex1_LocalStorage />
    // <Ex2_LocalStorage />
  );
}

export default App;
