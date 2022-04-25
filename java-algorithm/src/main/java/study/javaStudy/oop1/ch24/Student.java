package study.javaStudy.oop1.ch24;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;

    // 학생들이 수강하는 과목을 ArrayList로 가지고 있도록
    ArrayList<Subject> subjectList;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        //생성자에 학생들의 과목을 저장하는 과목 ArrayList 생성
        // 학생 인스턴스가 생성되면 과목 객체배열 또한 자동으로 할당이 된다.
        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point){
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScorePoint(point);

        // 과목에 대한 정보를 학생의 과목 ArrayList에 저장
        subjectList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;
        for (Subject subject : subjectList) {
            total += subject.getScorePoint();
            System.out.println(studentName + "학생의 " + subject.getSubjectName() + " 과목의 성적은 " + subject.getScorePoint() + "점 입니다.");
            }
    }
}
