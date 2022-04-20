package study.Inflearn.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수열_p4_재귀 { //14분
    public int solution(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return solution(n-1) + solution(n-2);
    }
    public static void main(String[] args) throws IOException {
        피보나치수열_p4_재귀 T = new 피보나치수열_p4_재귀();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(T.solution(i)+" ");
        }
    }


}
