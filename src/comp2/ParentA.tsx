import React from 'react'
import ChildC from './ChildC';

const ParentA: React.FC = () => {

    const dataA = "부모A의 데이터 A";
    const dataB = "부모A의 데이터 B";

    return (
        <div>
            <ChildC propA={dataA} propB={dataB} propC='' />
        </div>
    )
}

export default ParentA