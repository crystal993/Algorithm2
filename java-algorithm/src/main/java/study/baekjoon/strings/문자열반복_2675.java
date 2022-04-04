package study.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," ");

            int R = Integer.parseInt(st.nextToken());
            String str[] = String.valueOf(st.nextToken()).split("");
            
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(str[j]);
                }
            }
            System.out.println("");
        }
    }
}
