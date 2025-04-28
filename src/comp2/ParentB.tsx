import React from 'react'
import ChildC from './ChildC';

const ParentB: React.FC = () => {

    const dataA = "부모B의 데이터 A";
    const dataC = "부모B의 데이터 C";

    return (
        <div>
            <ChildC propA={dataA} propC={dataC} />
        </div>
    )
}

export default ParentB