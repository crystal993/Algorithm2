package study.javaStudy.oop;


public class StudentTest2 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2(20220418,"이수정", 4);
        System.out.println(studentLee.showStudentInfo());

        Student2 studentKim = new Student2(123456,"김수정",3);
        System.out.println(studentKim.showStudentInfo());
    }
}
