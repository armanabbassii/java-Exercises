//🔹 Exercise 1:
//Create a Student class with the attributes: name and age (both private).
//• Add proper getter and setter methods.
//• In the setter for age, prevent setting age less than 6 or more than 100.
//• In the main method, create a few students and test the validation


package CW4.Week4.q1;

public class Student {
    private int age;
    private String name;
    public int[] grade;


    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }


    public Student(String name, int age, int[] grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public void setAge(int age) {
        if (age > 0 && age < 6) {
            // age variable ro berisim dakhel instance variable
            //دیس، اشاره میکنه به فیلد ابجکتی که دم دستمه، اشاره میکنه به فیلد ابجکتی که دارم کار میکنم میکنه.
            this.age = age;

        }

    }
    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int[] grades){
        this.grade = grades;

    }


}
