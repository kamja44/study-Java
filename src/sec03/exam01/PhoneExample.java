package sec03.exam01;

public class PhoneExample {
    public static void main(String args[]){
        // Phone phone = new Phone() <- abstract로 선언한 추상클래스 이기 때문에 객체 생성 불가

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
