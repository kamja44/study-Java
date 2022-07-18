package sec04.exam05;

public class Car {
    // 필드
    int speed;
    // 생성자

    // 메서드
    int getSpeed(){
        return speed;
    }

    void keyTurnOn(){
        System.out.println("시동 ON");
    }

    void run(){
        for(int i=0; i<50; i += 10){
            speed = i;
            System.out.println("달린다. 시속 "+speed);
        }
    }
}
