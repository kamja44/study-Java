package sec05.exam03;

public class Car {
    // 인스턴스 필드
    int speed;
    // 인스턴스 메소드
    void run(){
        System.out.println(speed + "으로 달립니다.");
    }
    public static void main(String args[]){
        Car myCar = new Car();
        myCar.speed = 1000;
        myCar.run();
    }
}
