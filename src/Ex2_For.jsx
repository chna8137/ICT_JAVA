// Ex2_For.jsx
import React from "react";

const Ex2_For = () => {

    // 이 영역이 자바스크립트 영역
    // for문은 여기서 돌릴 수 있음
    const rows = [];
    for (let i = 0; i < 10; i++) {
        rows.push(<p key={i} style={{ display: "inline-block", margin: 20 }}>{i + 1}</p>);
    }

    console.log(rows);

    return (
        <div>
            <h2>Ex2_For</h2>
            <div>{
                rows.map((e, idx) => e)
            }</div>
            <hr />
            <div>{rows}</div>
        </div>
    );
}

export default Ex2_For;