package study.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드_11654_1 {
    public static void main(String[] args) throws IOException {
        // 문자 -> 숫자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char a = br.readLine().charAt(0);
        System.out.println((int)a);
    }
}
