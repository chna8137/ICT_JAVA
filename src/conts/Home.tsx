import React from 'react'
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import Slider from "react-slick";


const Home: React.FC = () => {

    const settings = {
        dots: true,
        infinite: true,
        speed: 500,
        slidesToShow: 1, // 한 번에 보여줄 슬라이드 수
        slidesToScroll: 1, // 한 번에 넘길 때 몇 개씩 넘길 것인지
        autoplay: true, // 자동 시작
        autoplaySpeed: 3000, // 넘기는 속도
        arrows: true // 화살표 좌우우
    };

    const homeData = [
        { id: 1, img: "images/bg1.png", text: "안녕하세요  ICT Password!" },
        { id: 2, img: "images/bg2.png", text: "spring & React 전문가" },
        { id: 3, img: "images/bg4.png", text: "함께 성장해요!" },
    ]

    return (
        <div style={{ maxWidth: '900px', margin: '0 auto', marginTop: '30px' }}>
            <h2 style={{ textAlign: 'center', marginBottom: '20px' }}>Home</h2>
            <Slider {...settings}>
                {
                    homeData.map(hdata => (
                        <div key={hdata.id}>
                            <div style={{
                                position: 'relative', height: '400px',
                                background: `url(${hdata.img}) center/cover no-repeat`,
                                borderRadius: '10px',
                                overflow: 'hidden'
                            }}>
                                <div style={{
                                    position: 'absolute', top: '50%', left: '30%',
                                    backgroundColor: 'rgba(255, 236, 134, 0.5)',
                                    color: '#6D87DB',
                                    fontSize: '24px',
                                    fontWeight: 'bold',
                                    padding: '20px 40px',
                                    borderRadius: '8px'
                                }}>{hdata.text}</div>
                            </div>
                        </div>
                    ))
                }

            </Slider>
        </div>
    )
}

export default Home