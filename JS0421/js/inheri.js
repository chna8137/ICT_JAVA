class BookC {
    constructor(title, price) {
        this.title = title;
        this.price = price;
    }
    buy() {
        return `${this.title} 을 ${this.price} 원에 구매했음`;
    }
}

class TextBook extends BookC {
    constructor(title, price, major) {
        super(title, price); // 상속받은 부모의 생성자를 호출
        this.major = major; // 자식의 프로퍼티를 저장
    }
    buyTextBook() {
        return `${this.major} 전공서적, ${this.title} 을 구매했음`
    }
}