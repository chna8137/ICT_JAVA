import React from "react";

const Ex3_gugudan = () => {

    const tableRows = [];

    for (let i = 0; i < 10; i++) {
        const row = [];
        for (let j = 1; j < 10; j++) {
            if (i === 0) {
                row.push(
                    <th key={`${j}`} style={{ padding: "8px", border: "1px solid #ccc" }}>
                        {`${j}단`}
                    </th>
                )
            } else {
                row.push(
                    <td key={`${j}x${i}`} style={{ padding: "8px", border: "1px solid #ccc" }}>
                        {`${j} x ${i} = ${j * i}`}
                    </td>
                );
            }
        }
        tableRows.push(<tr key={i}>{row}</tr>);
    }

    return (
        <div style={{ padding: "20px", textAlign: "center" }}>
            <h2>구구단</h2>
            <table style={{ borderCollapse: "collapse", margin: "0 auto" }}>
                <tbody>{tableRows}</tbody>
            </table>
            <h2>구구단</h2>
            <table style={{ borderCollapse: "collapse", margin: "0 auto" }}>
                <tbody>{tableRows.map(e => e)}</tbody>
            </table>
        </div>
    );
}

export default Ex3_gugudan;