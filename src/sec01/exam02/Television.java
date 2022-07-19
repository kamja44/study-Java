package sec01.exam02;

public class Television implements RemoteControl{
    // 필드
    private int volumn;

    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    public void setVolumn(int volumn){
        if(volumn > RemoteControl.MAX_VOLUMN){
            this.volumn = RemoteControl.MAX_VOLUMN;
        }else if(volumn < RemoteControl.MIN_VOLUMN){
            this.volumn = RemoteControl.MIN_VOLUMN;
        }else{
            this.volumn = volumn;
        }
        System.out.println("현재 TV 볼륨 : "+volumn);
    }
}
