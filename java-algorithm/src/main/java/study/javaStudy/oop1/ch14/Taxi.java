package study.javaStudy.oop1.ch14;

public class Taxi {
    String companyName;
    int money;
    int passengerCount;

    public Taxi(String companyName){
        this.companyName = companyName;
    }

    public void take(int money){
        this.money += money;
        this.passengerCount++;
    }

    public void showTaxiInfo(){
        System.out.println(companyName+" 수입은 "+money+"원 입니다.");
    }
}
