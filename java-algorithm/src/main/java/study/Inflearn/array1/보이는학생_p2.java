package study.Inflearn.array1;

import java.util.Scanner;

public class 보이는학생_p2 { //9분

    // 값이 큰 경우가 몇번인지 세는 문제이다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1; //최댓값 담을 변수
        int cnt = 0; // 값이 큰 경우를 세는 변수
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            if(height > max){
                max = height;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
