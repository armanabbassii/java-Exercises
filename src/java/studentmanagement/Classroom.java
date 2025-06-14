package studentmanagement;

public class Classroom {
    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public void printAllStudents() {
        for (Student student : students) {
            student.printInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = students[0];

        for(Student student : students){
            // فرض میکنیم که اولین student، تاپ هست
            if(student.getAverageGrade() > topStudent.getAverageGrade()){
                topStudent = student;
            }
        }
        return topStudent;
    }
}
