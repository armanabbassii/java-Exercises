//🔹 Exercise 1:
//Create a Student class with the attributes: name and age (both private).
//• Add proper getter and setter methods.
//• In the setter for age, prevent setting age less than 6 or more than 100.
//• In the main method, create a few students and test the validation


package CW4.Week4.q1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("arman", 30,new int[] {10,12,14});
        Student student1 = new Student("Ali", 20,new int[] {10,5,20});


        Student student2 = new Student("hassan", 60);
//        int[] arr1 = {10,22,33};
        student2.setGrade(new int[]{10,22,33} );
        System.out.println(Arrays.toString(student2.grade));


//        System.out.println(Arrays.toString(student.grade));
        System.out.println(student.getAge());
        System.out.println(student.getName());

        student.setName("Ali");
        student.setAge(50);

    }
}
