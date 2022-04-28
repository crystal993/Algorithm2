package study.javaStudy.oop2.ch4;

public class CustomerTest {
    public static void main(String[] args) {
        
        // 일반회원 
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + " 구매한 A상품의 가격은 " + price + "원 입니다.");

        // vip 회원
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calPrice(1000); //재정의된 calPrice

        System.out.println(customerKim.showCustomerInfo() + " 구매한 A상품의 가격은 " + price + "원 입니다.");

        // 형변환
        // 상위클래스 = 하위클래스; // 하위클래스가 상위클래스로 묵시적 형변환
        // 상위클래스의 멤버변수와 메소드만 사용이 가능하다. 
        Customer vc = new VIPCustomer(12345,"noname");

        // 가상함수 방식, 가상메서드 방식
        // 하위클래스(VIPCustomer)로 오버라이딩된 calPrice가 출력되는 것을 볼 수 있다.
        System.out.println(vc.calPrice(1000)); // 900

    }
}
