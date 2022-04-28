package study.javaStudy.oop2.ch9;

// 방법1 추상클래스를 상속받은 추상클래스
//public abstract class Desktop extends Computer{
//
//}

// 방법2 추상클래스를 상속받아서 구현하는 클래스
public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
