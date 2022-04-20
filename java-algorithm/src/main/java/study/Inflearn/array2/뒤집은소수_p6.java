package study.Inflearn.array2;

import java.util.Scanner;

public class 뒤집은소수_p6 {
    public static void main(String[] args) { //24
        Scanner sc = new Scanner(System.in);

        // 1. 입력
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        //2. 자릿수에 상관없이 숫자를 뒤집는 알고리즘
        for (int i = 0; i < n; i++) {
            int tmp = num[i];
            int res = 0;
            while (tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            num[i]=res;
        }

        //3. 소수인지 판별한다.
        int number =0, cnt=0;
        for (int i = 0; i < n; i++) {
            number = num[i];
            cnt=0;
            for (int j = 1; j <= number; j++) {
                if(number%j==0){
                    cnt++;
                }
            }
            if(cnt==2) System.out.print(number+" ");
        }
    }
}
