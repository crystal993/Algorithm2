package study.javaStudy.oop.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentA = new Student("James", 5000 );
        Student studentB = new Student("Tomas", 10000 );

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        // studentA가 100번 버스를 탐
        studentA.takeBus(bus100);

        Subway greenSubway = new Subway(2);

        // studentB가 2호선 지하철을 탐
        studentB.takeSubway(greenSubway);

        studentA.showInfo();
        studentB.showInfo();
        bus100.showBusInfo();
        greenSubway.showSubwayInfo();
        bus500.showBusInfo();

    }
}
