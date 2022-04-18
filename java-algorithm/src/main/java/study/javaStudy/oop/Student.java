package study.javaStudy.oop;

public class Student {
    public int studentId; // 학생 아이디
    public int studentNumber; //학생번호
    public String studentName; //학생이름
    public int majorCode; //전공과목 코드
    public String majorName; //전공과목 이름
    public int grade; //학년
    public String address; //주소

    public void showStudentInfo(){
        System.out.println(studentId + "학생의 이름은" + studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
