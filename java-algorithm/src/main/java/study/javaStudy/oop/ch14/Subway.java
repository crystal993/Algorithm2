package study.javaStudy.oop.ch14;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    // 협력 메서드 - 지하철을 탔을 때
    public void take(int money) {
        this.money += 1200;
        passengerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
