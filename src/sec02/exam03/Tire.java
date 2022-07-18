package sec02.exam03;

public class Tire {
    // field
    public int maxRotation; // 최대회전수
    public int accmulatedRotation; // 누적회전수
    public String location; // 타이어의 위치

    // 생성자
    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메소드
    public boolean roll(){
        ++accmulatedRotation;
        if(accmulatedRotation < maxRotation){
            System.out.println(location + " Tire 수명 : " + (maxRotation - accmulatedRotation) + "회");
            return true;
        }else{
            System.out.println(location + "펑크");
            return false;
        }
    }
}
