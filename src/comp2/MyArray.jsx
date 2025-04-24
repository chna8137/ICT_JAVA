// MyArray.jsx

import "./myarray.css"

const MyArray = () => {

    // 자바스크립트 배열 -> obj
    const boardV = [
        { num: 1, title: "물감", name: "상품1", content: "알록달록 물감", price: "200,000", img: "images/prod1.jpg", date: "2025-04-22" },
        { num: 2, title: "옷", name: "상품2", content: "이쁜 옷", price: "250,000", img: "images/prod2.jpg", date: "2025-04-23" },
        { num: 3, title: "와인", name: "상품3", content: "맛있는 와인", price: "300,000", img: "images/prod3.jpg", date: "2025-04-24" }
    ];
    return (<div id='container'>
        <h1>신상품 목록</h1>
        <ul className="prod-list">
            {
                boardV.map((board, index) => (
                    // <div key={index} className="mydiv">
                    //     <p>번호 : {board.num}</p>
                    //     <p>제목 : {board.title}</p>
                    //     <p>작성자 : {board.writer}</p>
                    //     <p>이미지 : <img src={board.img} alt={board.title} /></p>
                    // </div>
                    <div key={index}>
                        <li>
                            <img src={board.img} alt={board.title} />
                            <div className="caption">
                                <h2>{board.title}</h2>
                                <p>{board.name} : {board.content}</p>
                                <p>가격 : {board.price}</p>
                                <p>출시일 : {board.date}</p>
                            </div>
                        </li>
                    </div>
                ))
            }
        </ul>
    </div>
    );
}

export default MyArray;