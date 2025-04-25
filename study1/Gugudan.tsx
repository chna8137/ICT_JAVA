import React, { useState } from 'react'



const Gugudan: React.FC = () => {

    const [dan, setDan] = useState(0);
    const [limit, setLimit] = useState(0);
    const [color, setColor] = useState('');
    // const [tableRows, setTableRows] = useState<any[]>([]);

    const danChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        console.log(e.target.value);
        setDan(parseInt(e.target.value));
    }
    const limitChange = (e: React.ChangeEvent<HTMLSelectElement>) => {
        console.log(e.target.value);
        setLimit(parseInt(e.target.value));
    }
    const colChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        console.log(e.target.value);
        setColor(e.target.value);
    }
    const tableRows = [];
    let start: number = Math.ceil(dan - (limit / 2));
    let end: number = Math.ceil(dan + (limit / 2));
    console.log(start, end);

    for (let i = 0; i < 10; i++) {
        const row = [];
        for (let j = start; j < end; j++) {
            if (i === 0) {
                row.push(
                    <th key={`${j}`} style={{ padding: "8px", border: "1px solid #ccc" }}>
                        {`${j}단`}
                    </th>
                )
            } else {
                if (j === dan) {
                    row.push(
                        <td key={`${j}x${i}`} style={{ padding: "8px", border: "1px solid #ccc", backgroundColor: `${color}` }}>
                            {`${j} x ${i} = ${j * i}`}
                        </td>
                    );
                } else {
                    row.push(
                        <td key={`${j}x${i}`} style={{ padding: "8px", border: "1px solid #ccc" }}>
                            {`${j} x ${i} = ${j * i}`}
                        </td>
                    );
                }
            }
        }
        tableRows.push(<tr key={i}>{row}</tr>);
    }

    return (
        <div style={{ padding: "20px", textAlign: "center" }}>
            <h2>구구단</h2>
            <input type="text" onChange={danChange} />
            <select onChange={limitChange}>
                <option value="1">1</option>
                <option value="3">3</option>
                <option value="5">5</option>
                <option value="7">7</option>
                <option value="9">9</option>
            </select>
            <input type="color" onChange={colChange} />
            <button>구구단 생성</button>
            <table style={{ borderCollapse: "collapse", margin: "0 auto" }}>
                <tbody>{tableRows.map(e => e)}</tbody>
            </table>
        </div>
    )
}

export default Gugudan;