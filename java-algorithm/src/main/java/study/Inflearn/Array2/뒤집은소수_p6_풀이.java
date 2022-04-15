package study.Inflearn.Array2;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수_p6_풀이 {
    // 2. 소수인지 판별하기
    private boolean isPrime(int num) {
        if(num==2) return false;
        for (int i = 2; i <= num; i++) {
            if (num%i==0) return false; //2부터 나누기 시작하니깐
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] num) {
        ArrayList<Integer> answer = new ArrayList<>();
        //1. 숫자를 뒤집기
        for (int i = 0; i < n; i++) {
            int tmp = num[i]; // 203
            int res = 0; // 0
            while (tmp > 0){ // 203 20 2
                int t = tmp % 10; // 3 0 2
                res = res*10 + t; // 3 30 302
                tmp = tmp/10; // 20 2 0이면 멈춤
            }
            if(isPrime(res)) num[i] = res;
        }
        return answer;
    }

    public static void main(String[] args) {
        뒤집은소수_p6_풀이 T = new  뒤집은소수_p6_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int x : T.solution(n, num)) {
            System.out.print(x+" ");
        }
    }


}
