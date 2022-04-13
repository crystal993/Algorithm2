package study.javaStudy.javaBasic;

public class VariableTest {
    public static void main(String[] args) {

        // byte의 범위 -128 ~ 127
        byte num = -128;
        System.out.println("num = " + num); //성공

//        byte num2 = 128;
//        System.out.println("num2 = " + num2); //오류

//        int num3 = 12345678908; // 범위 초과
          long lnum = 12345678908l; // 성공

    }
}
