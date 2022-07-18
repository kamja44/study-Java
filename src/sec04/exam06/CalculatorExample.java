package sec04.exam06;

public class CalculatorExample {
    public static void main(String args[]){
        Calculator myCal = new Calculator();

        // 직사각형
        double result1 = myCal.areaRectangle(10.0, 14.2);

        //정사각형
        double result2 = myCal.areaRectangle(15.5);
        System.out.println(result1 + "<- 직사각형 | 정사각형 -> " + result2);
    }
}
