package sec01.exam04;

public class SupersonicAirplane extends Airplane{
    public static final int Normal = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = Normal;

    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("엄청빠르게 날아간다~");
        }else{
            super.fly();
        }
    }
}
