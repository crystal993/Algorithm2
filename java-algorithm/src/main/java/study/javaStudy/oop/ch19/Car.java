package study.javaStudy.oop.ch19;

public class Car {
    private static int serialNumber=10000;
    private int CarNumber;

    Car(){

    }

    // serialNumber를 확인할 수 있는 메서드
    public static int getSerialNumber() {
        return serialNumber;
    }

    // 일반메서드에서 static변수를 사용하는 것 가능
    public int getCarNum() {
        serialNumber++;
        CarNumber = serialNumber;
        return CarNumber;
    }
}
