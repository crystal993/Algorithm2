package study.javaStudy.oop.ch19;

public class CarFactory {

    // CarFactory 인스턴스 생성
    // static : 싱글톤패턴
    // 객체의 인스턴스가 오직 하나
    private static CarFactory instance = new CarFactory();

    private CarFactory(){

    }

    // CarFactory 인스턴스에 접근가능한 getInstance 메소드
    // static으로 선언
    public static CarFactory getInstance(){
        // 인스턴스를 생성하지 않았을 때도
        // static메서드를 호출하는 것이 가능하기 때문에
        // if과정을 넣어줌
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
