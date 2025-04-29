import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Layout from './comp/Layout';
import Home from './conts/Home';
import BoardList from './conts/BoardList';
import Gallery from './conts/Gallery';
import Chart from './conts/Chart';
import Community from './conts/Community';
import Diary from './conts/Diary';
import Login from './conts/Login';
import Signup from './conts/Signup';


function App() {
  return (
    <Router> {/* 전체 라우팅 시스템의 루트(최상단) */}
      <Layout>
        <Routes> {/* 여러개의 Route를 묶는 컨테이너(부모) 역할 */}
          <Route path='/login' element={<Login />} />
          <Route path='/signup' element={<Signup />} />
          <Route path='/' element={<Home />} /> {/* 각각 path와 연결된 컴포넌트를 정의 */}
          <Route path='/board' element={<BoardList />} />
          <Route path='/gallary' element={<Gallery />} />
          <Route path='/chart' element={<Chart />} />
          <Route path='/community' element={<Community />} />
          <Route path='/diary' element={<Diary />} />
        </Routes>
      </Layout>
    </Router>
  );
}

export default App;
