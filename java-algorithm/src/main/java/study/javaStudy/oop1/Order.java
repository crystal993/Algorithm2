package study.javaStudy.oop1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Order {
    String orderId; //주문 접수 번호
    String orderPhone; //주문 핸드폰 번호
    String orderAddres; //주문 집 주소
    String orderDate; //주문 날짜
    String orderTime; //주문 시간
    int orderPrice; //주문 가격
    String menuNumber; //메뉴 번호

    // 현재 날짜, 시간 구하기
    LocalDate nowDate = LocalDate.now();
    LocalTime nowTime = LocalTime.now();
    // 포맷정의
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HHmmss");
    // 포맷적용
    String formatedNowDate = nowDate.format(formatter);
    String formatedNowTime = nowTime.format(formatter2);

    Order(String orderPhone, String orderAddres, int orderPrice, String menuNumber){
        this.orderId = formatedNowDate + menuNumber;
        this.orderPhone =orderPhone;
        this.orderAddres =orderAddres;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
        this.orderDate = formatedNowDate;
        this.orderTime = formatedNowTime;
    }

    public void showOrderInfo(){
        System.out.println("주문 접수 번호 : "+orderId);
        System.out.println("주문 핸드폰 번호 : "+orderPhone);
        System.out.println("주문 집 주소 : "+orderAddres);
        System.out.println("주문 날짜 : "+orderDate);
        System.out.println("주문 시간 : "+orderTime);
        System.out.println("주문 가격 : "+orderPrice);
        System.out.println("메뉴 번호 : "+menuNumber);
    }
}
