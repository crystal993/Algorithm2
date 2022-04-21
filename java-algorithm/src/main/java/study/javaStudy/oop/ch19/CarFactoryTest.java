package study.javaStudy.oop.ch19;

public class CarFactoryTest {
    public static void main(String[] args) {

        // static변수는 객체가 생성하기 전에
        // 클래스 이름으로 접근하면 불러오는 것이 가능하다.
        System.out.println(Car.getSerialNumber()); // 10000

        // 싱글톤 패턴 : 객체의 인스턴스가 하나
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();
        Car ourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum()); //10001
        System.out.println(yourSonata.getCarNum()); // 10002
        System.out.println(ourSonata.getCarNum()); // 10003
    }
}
