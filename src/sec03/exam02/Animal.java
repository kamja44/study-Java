package sec03.exam02;

public abstract class Animal {
    public String kind;

    public void breath(){
        System.out.println("숨쉰다.");
    }
    public abstract void sound(); // 추상 메소드
}
