package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8_1유효한팰린드롬{ //6분
    // Character.isAlphabetic(str[lt])
    // lt, rt 방식으로 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 소문자로 변환뒤 char배열로 변환
        char[] str = br.readLine().toLowerCase().toCharArray();
        int lt = 0, rt = str.length-1;
        String answer = "";

        // 2. lt와 rt가 같거나 크면 종료될때까지 탐색
        while (lt < rt){
            // str[lt]가 알파벳이 아닐때
            if(!Character.isAlphabetic(str[lt])) {
                lt++; // lt 1 증가
            // str[rt]가 알파벳이 아닐때
            } else if(!Character.isAlphabetic(str[rt])){
                rt--; // rt 1감소
            // str[rt], str[lt]가 알파벳일 때
            } else {
                // str[rt]와 str[lt] 다르면 no출력
                if(str[lt]!=str[rt]){
                    answer = "NO";
                    break;
                // str[rt]와 str[lt] 같으면 yes출력
                } else {
                    answer = "YES";
                    lt++;
                    rt--;
                }
            }
        }
        System.out.println(answer);
    }
}