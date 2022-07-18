package sec01.exam06;

public class SportsCar extends Car{
    @Override
    public void speedUp(){
        speed += 10;
    }
    // 부모 class의 stop() 메소드가 final로 설정되어 있기에 메소드 재정의(OVERRIDE) 불가능
//    @Override
//    public void stop(){
//        System.out.println("멈춰!");
//        speed = 0;
//    }
}
