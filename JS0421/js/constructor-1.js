// function myTest() {
//     alert("Test");
// }

function Book(title, pages, done = false) {
    this.title = title;
    this.pages = pages;
    this.done = done;
    this.finish = function () {
        let str = "";
        this.done === false ? (str = "읽는 중") : (str = "완독");
        return str;
    }
}

// new란 키워드로 함수를 호출하면 -> 생성자 함수를 호출
const book1 = new Book("리액트 정석", 664, false);
const book2 = new Book("jsp의 정석", 300, true);

console.log(`${book1.title} - ${book1.pages} 쪽 - ${book1.finish()}`);
console.log(`${book2.title} - ${book2.pages} 쪽 - ${book2.finish()}`);