package sec04.exam01;

public class Calculator {
    // field

    // constructor

    // method
    void powerOff(){
        System.out.println("전원 OFF");
    }
    void powerOn(){
        System.out.println("전원 ON");
    }
    int plus(int x, int y){
        int result = x+y;
        return result;
    }
    double devide(int x, int y){
        double result = (double) x / (double) y;
        return result;
    }
}
