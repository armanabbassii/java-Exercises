package studentmanagement;

public class Main {
    public static void main(String[] args) {


        // راه طولانی تر
//        int[] a = new int[3];
//        a[0]= 18;
//        a[1]= 18;
//        a[2]= 18;
// راه اسون تر که در تعریف ابجکت ازش استفاده میتوینم کنیم
//         در واقع اینطوریه int[] b = new int[] {18,17,20};

        Student student1 = new Student("Zahra", "Hamdid", 1, new int[]{18, 17, 20});
        Student student2 = new Student("Zahra1", "rezaee", 2, new int[]{18, 17, 20, 10});
        Student student3 = new Student("Zahra2", "javadi", 3, new int[]{18, 17, 20, 10, 50});


        //جای درستش داخل متد student هست
//        for (int grade : student1.getGrades()) {
//            System.out.println(grade);

        Classroom classroom = new Classroom(new Student[] {student1,student2,student3});


//        System.out.println(student3);
        classroom.printAllStudents();

//        student t
        System.out.println(classroom.findTopStudent());


        }
    }



