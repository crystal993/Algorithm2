package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8_2유효한팰린드롬 {  //4분 17초
    // replaceALL(정규식,바꿀문자)
    // StringBuilder(str).reverse().toString()
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 소문자로 변환
        String str = br.readLine().toLowerCase();

        // 2. 특수문자 제거
        str = str.replaceAll("[^a-z]","");

        // 3. 단어 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();
        String answer;

        // 4. 비교
        if(tmp.equals(str)) answer="YES";
        else answer="NO";

        System.out.println(answer);
    }
}
