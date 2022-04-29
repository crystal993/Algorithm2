package study.javaStudy.oop2.ch10;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다.");
        System.out.println("자동차가 스스로 자율주행을 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 스스로 멈춥니다.");
    }

    // 구현부 존재함, 추상메서드가 아님.
//    @Override
//    public void wiper() {}

    @Override
    public void wiper() {
        System.out.println("세차를 합니다.");
    }
}
