package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9_1숫자만추출 { //4분 5초
    // Character.isDigit(x) : 숫자인지 여부 판별
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }

        System.out.println(Integer.parseInt(answer));
    }
}
