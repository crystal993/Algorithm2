package study.javaStudy;

public class ConstantTest {
    public static void main(String[] args) {

        final int MAX_NUM = 100; //상수이므로 값이 변하지 않는다.
        final int MIN_NUM;

        MIN_NUM = 0;
//        MAX_NUM = 20;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

    }
}
