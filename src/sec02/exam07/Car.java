package sec02.exam07;

public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLefTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLefTire.roll();
        backRightTire.roll();
    }
}
