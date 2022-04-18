package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9_2숫자만추출 { //4분 17초
    //아스키코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('0' <= ch && ch <= '9') answer += ch;
        }
        System.out.println(Integer.parseInt(answer));
    }
}
