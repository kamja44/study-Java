package sec01.exam01;

public class CellPhone {
    // 필드
    String model;
    String color;

    // 생성자

    // 메서드
    void powerOn(){
        System.out.println("전원 on");
    }
    void powerOff(){
        System.out.println("전원 Off");
    }
    void bell(){
        System.out.println("벨");
    }
    void sendVoice(String message){
        System.out.println("자기 : "+ message);
    }
    void receiveVoice(String message){
        System.out.println("상대방 : "+message);
    }
    void hangUp(){
        System.out.println("전화 끊기");
    }

}
