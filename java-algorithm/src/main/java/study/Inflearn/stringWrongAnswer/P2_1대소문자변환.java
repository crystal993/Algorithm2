package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_1대소문자변환 { //3분 41초
    //Character.isLowerCase(str), Character.isUpperCase(str) : return boolean
    //str.toLowerCase(), str.toUpperCase() : return char
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";

        for (char x : str.toCharArray()) {
            // 소문자 -> 대문자
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            // 대문자 -> 소문자
            else answer += Character.toLowerCase(x);
        }

        System.out.println(answer);

    }
}

