package study.javaStudy.oop2.ch10;

// 추상클래스 
public abstract class Car {
    
    // 추상메소드
    // 하위클래스에서 상속받아 구현부 구현하도록
    public abstract void drive();
    public abstract void wiper();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 템플릿메서드
    // 이 시나리오는 변하면 안된다. 
    // final로 선언 : 하위클래스에서 run() 변경하지 못하도록
    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        System.out.println();
    }
}
