package studentmanagement;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private int[] grades;

    public Student(String firstName, String lastName, int studentId, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.grades = grades;


    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
//          sum = sum + grade;
        }
        return (double) sum/ grades.length;
        // سام رو دابل اول باید کنیم
//        return (double) sum/ grades.length;
        //first change sum to double.
    }

    public void printInfo() {
        System.out.println("First Name" + firstName
                + "\nLastName" + lastName
                + "\nStudentId" + studentId
                + "\nGrade Average" + getAverageGrade()
        );
        System.out.print(" Grades: ");
        for (int grade : grades) {
            System.out.println(grade + ", ");
        }
        System.out.println("\n,--------");
    }
    public int[] getGrades() {
        return grades;
    }


    //چون رفتارش این نیس برای همین override میکنیم
    //  برای برگردوندن جزییات
    @Override
    public String toString(){
        return("First Name" + firstName
                + "\nLastName" + lastName
                + "\nStudentId" + studentId
                + "\nGrade Average" + getAverageGrade()
                + Arrays.toString(getGrades())
        );
    }


}
