package sec04.exam01;

public class CalculatorExample {
    public static void main(String args[]){
        Calculator myCal = new Calculator();
        myCal.powerOn();

        int result = myCal.plus(5,6);
        System.out.println(result);

        byte x = 10;
        byte y = 4;
        double result2 = myCal.devide(x,y);
        System.out.println(result2);

        myCal.powerOff();
    }
}
