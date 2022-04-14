package study.javaStudy.javaBasic;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int i=2;

        // 단락 회로 평가 (short circuit evaluation)
        // 1. 논리곱 &&
        boolean value = ((num1 += 10 ) < 10) && ((i += 2)< 10);
        System.out.print("value = " + value);
        System.out.print("  num1 = " + num1);
        System.out.println("  i = " + i);

        //2. 논리합 ||
        value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
        System.out.print("value = " + value);
        System.out.print("  num1 = " + num1);
        System.out.println("  i = " + i);
    }
}
