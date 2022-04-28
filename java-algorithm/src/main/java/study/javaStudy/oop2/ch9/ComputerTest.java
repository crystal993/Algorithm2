package study.javaStudy.oop2.ch9;

public class ComputerTest {
    public static void main(String[] args) {

        // 업캐스팅, 묵시적 형변환
        // 하위클래스가 상위클래스로
        // 하위클래스와 상위클래스의 공통적인 메서드만 사용이 가능
        // 하위클래스에서 추가한 메서드는 사용이 불가능하다.
        Computer desktop = new Desktop();

        // Computer computer = new Computer(); // 에러
        // 에러나는 이유 : 추상클래스는 상속을 하기 위해서 만들어진 클래스이다.
        desktop.display(); //하위클래스인 desktop의 메소드가 실행된 것을 볼 수 있다.
    }
}
