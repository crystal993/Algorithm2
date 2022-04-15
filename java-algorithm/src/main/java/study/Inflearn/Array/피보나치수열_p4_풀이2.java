package study.Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수열_p4_풀이2 { //14분
    public void solution(int n) {
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) throws IOException {
        피보나치수열_p4_풀이2 T = new 피보나치수열_p4_풀이2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        T.solution(n);
    }


}
