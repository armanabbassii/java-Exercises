package OOP;

public class Chaining {
    String firstName;
    String lastName;
    int age;

    public Chaining(String firstName){
this.firstName = firstName;
    }
    public void showStudent(String firstName, String lastName){
        System.out.println("name is" + firstName);
//        this(firstName, lastName,18);

    }

    public Chaining(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
