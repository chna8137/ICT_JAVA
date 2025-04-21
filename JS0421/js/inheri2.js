class Animall {
    eat() {
        throw new Error("eat() 메서드를 반드시 구현해야 합니다.");
    }
    sleep() {
        throw new Error("sleep() 메서드를 반드시 구현해야 합니다.");
    }
}

class Dog extends Animall {
    eat() {
        console.log("강아지가 먹는다.");
    }
    sleep() {
        console.log("강아지가 잔다.");
    }
}