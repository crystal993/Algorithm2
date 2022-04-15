package study.javaStudy.javaBasic;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        do {
            input = sc.nextInt(); //입력받는 구문
            sum += input;
        } while (input != 0);
        // 처음에 0 넣어도 종료가 안됨
        // 처음 수행문은 조건에 맞지 않아도 수행됨을 알 수 있다.

        System.out.println(sum);
    }
}
