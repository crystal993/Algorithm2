package study.javaStudy.oop1.ch10;

public class BirthDay {

    // 모든 데이터를 private으로 쓰는 것을 권장하지는 않는다.
    // public으로 오픈할 것은 오픈하기
    private int day;
    private int month;
    private int year;

    private boolean isValid; //외부에서 알지 못함
    // isValid는 get()메서드만 존재 - readOnly

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month >12) isValid = false;
        else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // read-only, set() 존재하지 않음.
    public boolean isValid() {
        return isValid;
    }

    public void showDate(){
        if(isValid){
            System.out.println(year + "년 "+ month + "월 " + day +"일 ");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
