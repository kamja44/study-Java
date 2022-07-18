package sec05.exam05;

public class PersonExample {
    public static void main(String args[]){
        Person person = new Person("123", "kamja");
        System.out.println(person.nation);
        System.out.println(person.ssn);
        System.out.println(person.name);

        person.name = "kkamja";
        System.out.println(person.name);
    }
}
