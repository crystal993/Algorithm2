package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_2대소문자변환 { //3분 51초
    //아스키코드로 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            // 대문자 -> 소문자
            if( 'A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                answer += (char)(str.charAt(i)+('a'-'A'));
            } //소문자 -> 대문자
            else answer += (char)(str.charAt(i)-('a'-'A'));
        }

        System.out.println(answer);
    }
}
