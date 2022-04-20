package study.javaStudy.oop.ch14;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 협력 메서드 - 버스를 탔을 때
    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}

