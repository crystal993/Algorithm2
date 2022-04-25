package study.javaStudy.oop1.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        // 싱글톤 패턴
        // static이므로 클래스 이름으로 가져다 써야한다.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        // Calender 내장 클래스
        // 싱클톤패턴으로 만들어짐.
        Calendar calendar = Calendar.getInstance();
    }
}
