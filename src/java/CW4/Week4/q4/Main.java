package CW4.Week4.q4;

public class Main {
    public static void main(String[] args) {
        //shallow copy
//        Person person1 = new Person("Ali");
//        Person person2 = person1;
//
//        person2.name = "Sara";
//
//        System.out.println(person1.name);
//        System.out.println(person2.name);

        // deep copy
        Person person1 = new Person("Ali");
        Person person2 = new Person(person1.name);

        person2.name = "Sara";

        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
