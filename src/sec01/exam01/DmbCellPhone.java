package sec01.exam01;

public class DmbCellPhone extends CellPhone{
    // 필드
    int channel;

    // 생성자
    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 메소드
    void turnOnDmb(){
        System.out.println(channel+"번 방송 시작");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println(channel+"번 체널로 바꾼다.");
    }
    void turnOffDmb(){
        System.out.println("DMB 방송 끄기");
    }
}
