package study.javaStudy.oop2.ch11;

// 인터페이스를 받아서 인터페이스의
// 일부 메서드만 구현하고 싶을 때 추상클래스로
public abstract class Calculator implements Calc{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

}
