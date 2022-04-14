package study.javaStudy.javaBasic;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        // System.in은 표준 입력이고
        // System.out은 표준 출력이다.

        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요.");

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 1 : ");
        int n = sc.nextInt();
        System.out.println("입력 2 : ");
        int m = sc.nextInt();

        // 삼항연산자 이용
        max = (n > m) ? n : m;
        System.out.println(max);

    }
}
