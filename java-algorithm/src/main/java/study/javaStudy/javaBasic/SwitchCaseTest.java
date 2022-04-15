package study.javaStudy.javaBasic;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        // 월을 입력받았을 때 그 월이 몇 일인지 출력하는 예제
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int day = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4 : case 6: case 9: case 11:
                day = 30;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");

        }
        System.out.println(month+"월은 "+day+"일 입니다.");
    }
}
