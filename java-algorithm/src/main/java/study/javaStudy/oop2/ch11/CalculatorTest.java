package study.javaStudy.oop2.ch11;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

// 인터페이스 타입 Calc로 선언
// 인터페이스에 존재하는 메서드만 접근이 가능하다.
        Calc calc = new CompleteCalc();
//        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));

    }
}
