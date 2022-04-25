package study.javaStudy.oop1;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 중심부";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();
        System.out.println();
        System.out.println("========== 인스턴스의 주소 =============");
        System.out.println("studentKim = " + studentKim);
        System.out.println("studentLee = " + studentLee);
    }
}
