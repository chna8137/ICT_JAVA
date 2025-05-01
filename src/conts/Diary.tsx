import React from 'react'
import HTMLFlipBook from 'react-pageflip';

interface MyBookProps {
    // 책 디자인의 너비와 높이 (필수)
    width?: number;
    height?: number;
    style?: React.CSSProperties;
    className?: string; // 우리가 만들 클래스 속성 적용
    maxShadowOpacity?: number; // 페이지 넘길 때 그림지의의 투명도 (기본값 1, 0 ~ 1)
    mobileScrollSupport?: boolean; // 모바일 장치에서 스크롤로 넘길 것이냐
    showCover?: boolean; // showCover가 true이면 첫번째 페이지를 표지로 사용하겠다.
    autoSize?: boolean;
}

// 데이터 생성
const myData = [
    {
        image: "images/bg1.png",
        text: "오늘은 강가를 걸었다. 물소리가 너무 좋았다. \n 정말 재미있었다. 아! 행복하다"
    },
    {
        image: "images/bg2.png",
        text: "얼른 집에 가고싶다. \n 너무 졸리다."
    },
    {
        image: "images/bg3.png",
        text: "오늘은 목요일이다. \n 왜 아직 목요일이지?"
    },
    {
        image: "images/bg4.png",
        text: "비가 온다. \n 비오는 날은 전과 막걸리...! 츄릅.."
    },
    {
        image: "images/bg5.png",
        text: "우리 집 근처에 커다란 목장~~ \n 메타메타 몽몽 메타메타 몽~~"
    }
]

const Diary: React.FC<MyBookProps> = () => {
    return (
        <div>
            <h2>Diary</h2>
            {/* 중앙에 배치를 하고 overflow :hidden 해서 흔들림 방지 */}
            <div style={{ width: '620px', margin: '20px auto', overflow: 'hidden' }}>
                {/* usePortrait={true} : 모바일에서 화면이 작으면 책이 한장(반응형 웹) */}
                <HTMLFlipBook width={300} height={400} showCover={true}
                    {...({ style: {}, usePortrait: true } as any)}
                    autoSize={true} mobileScrollSupport={true} maxShadowOpacity={0.2}
                    usePortrait={true} style={{ borderRadius: '10px' }}>

                    {(() => myData.flatMap((entry, idx) => [
                        //이미지 페이지
                        <div key={`img-${idx}`} style={{
                            width: '100%',
                            height: '100%',
                            backgroundColor: '#fff',
                            display: 'flex',
                            justifyContent: 'center',
                            alignItems: 'center',
                            overflow: 'hidden',

                        }}>
                            <img src={entry.image} alt={`Diary Image ${idx + 1}`} style={{ width: '100%', height: '100%', objectFit: 'cover' }} />
                        </div>,

                        //텍스트 페이지
                        <div key={`txt-${idx}`} style={{
                            width: '100%',
                            height: '100%',
                            backgroundColor: '#fff',
                            display: 'flex',
                            flexDirection: 'column',
                            justifyContent: 'center',
                            alignItems: 'center',
                            padding: '20px',
                            fontSize: '18px',

                        }}>
                            <p style={{ margin: 0 }}>{entry.text}</p>
                        </div>
                    ]))()}

                </HTMLFlipBook>
            </div>
        </div>
    )
}

export default Diary