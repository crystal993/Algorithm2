package study.javaStudy.oop1.ch10;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay date = new BirthDay();
        date.setYear(2021);
        date.setMonth(12);
        date.setDay(31);

        // date.month=12; //set()메서드로 접근해야한다.
        // set() 메서드는 데이터 남용을 막아준다.

        date.showDate();
    }
}
