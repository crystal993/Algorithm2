package study.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드_11654_2 {
    public static void main(String[] args) throws IOException {
        // 숫자 -> 문자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        System.out.println((char)a);
    }
}
