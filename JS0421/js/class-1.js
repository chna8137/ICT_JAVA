class Book2 {
    constructor(title, pages, done) {
        this.title = title;
        this.pages = pages;
        this.done = done;
    }
    finish() {
        let str = "";
        this.done === false ? (str = "읽는 중") : (str = "완독");
        return str;
    }
}