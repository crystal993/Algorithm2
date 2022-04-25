package study.Inflearn.ArrayWrongAnswer;

import java.util.Scanner;

public class P6뒤집은소수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //1. 자연수 뒤집기
        //2. 소수 판별
        //3. 뒤집은 소수 출력

        for (int i = 0; i < n; i++) {

            // 1. 자연수 뒤집기
            int tmp = arr[i]; // 32
            int res = 0; // 0
            while (tmp>0){ // 32 3
                int t = tmp % 10; // 2, 3
                res = res*10 + t; // 0*10+2 =2, 2*10+3 =23
                tmp = tmp / 10; // 3 0
            }

            // 2,3. 뒤집은 숫자 소수 판별 및 출력
            int cnt = 0;
            for (int j = 1; j <= res; j++) {
                if(res%j==0) cnt++;
            }
            if(cnt==2) System.out.print(res+" ");
        }
    }
}
