package sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String args[]){
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

        // CellPhone 클래스로부터 상속받은 필드
        System.out.println(dmbCellPhone.model);
        System.out.println(dmbCellPhone.color);

        // DmbCellPhone 클래스의 필드
        System.out.println(dmbCellPhone.channel);

        // Cellphone 클래스로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("하이");
        dmbCellPhone.receiveVoice("하이요");
        dmbCellPhone.sendVoice("예~");
        dmbCellPhone.hangUp();

        // DmbCellPhone 클래스의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
