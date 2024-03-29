package sec05.exam04;

public class SingletonExample {
    public static void main(String args[]){
//        Singleton obj1 = new Singleton(); -> compile error
//        singleton obj2 = new Singleton(); -> compile error

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
    }
}
