package sec04.exam03;

import java.nio.file.Paths;

public class Car {
    // 필드
        int gas;
    // 생성자

    // 메서드
        void setGas(int gas){
            this.gas = gas;
        }

        boolean isLeftGas(){
            if(gas == 0){
                System.out.println("gas가 없습니다.");
                return false;
            }else{
                System.out.println("gas가 있습니다.");
                return true;
            }
        }

        void run(){
            while(true){
                if(gas > 0){
                    System.out.println("현재 가스"+gas);
                    gas--;
                }else{
                    System.out.println("노 가스"+gas);
                    return;
                }
            }
        }
}
