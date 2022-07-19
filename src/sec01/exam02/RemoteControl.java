package sec01.exam02;

public interface RemoteControl {
    // 상수
    public static final int MAX_VOLUMN = 10;
    public static final int MIN_VOLUMN = 0;

    // 추상 메소드
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolumn(int volumn);
}
