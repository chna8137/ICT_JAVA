
const MyComponent = () => {
    const myData = { name: "테스형", age: 20 };
    console.log(myData.name);
    return (
        <div>
            <ul>
                <li>Name : {myData.name}</li>
                <li>Age : {myData.age}</li>
            </ul>
        </div>
    )
}

export default MyComponent;