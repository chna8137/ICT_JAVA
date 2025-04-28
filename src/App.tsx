import React from 'react';
import Ex1_useMemo from './comp1/Ex1_useMemo';
import Ex2_PersonForm from './comp1/Ex2_PersonForm';
import Ex3_PersonUseMemo from './comp1/Ex3_PersonUseMemo';
import ParentA from './comp2/ParentA';
import ParentB from './comp2/ParentB';
import Ex1_useState from './comp3/Ex1_useState';
import Ex2_FlowReactStateDemo from './comp3/Ex2_FlowReactStateDemo';
import Ex3_BatchUpdateExample from './comp3/Ex3_BatchUpdateExample';
import Ex4_useEffect from './comp3/Ex4_useEffect';
import Ex1_UseEffectFetch from './compfetch/Ex1_UseEffectFetch';

function App() {
  return (
    <div>
      {/* <Ex1_useMemo /> */}
      {/* <Ex2_PersonForm /> */}
      {/* <Ex3_PersonUseMemo /> */}
      {/* <ParentB /> */}
      {/* <Ex1_useState /> */}
      {/* <Ex2_FlowReactStateDemo /> */}
      {/* <Ex3_BatchUpdateExample /> */}
      {/* <Ex4_useEffect /> */}
      <Ex1_UseEffectFetch />
    </div>
  );
}

export default App;
