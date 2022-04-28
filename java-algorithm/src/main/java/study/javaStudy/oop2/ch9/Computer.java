package study.javaStudy.oop2.ch9;

// 추상클래스 : 추상메서드를 1개 이상 포함하고 있는 클래스
// 상속을 위한 클래스
public abstract class Computer {

    // 추상메서드
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
