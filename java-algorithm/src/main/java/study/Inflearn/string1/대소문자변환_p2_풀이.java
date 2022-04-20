package study.Inflearn.string1;

import java.util.Scanner;

public class 대소문자변환_p2_풀이 {
    public static void main(String[] args) {
        // 풀이2 - String을 CharArray로 만들어서 풀이
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String answer = "";

        // 대문자 -> 소문자, 소문자-> 대문자
        // Character.isLowerCase char문자를 소문자로
        // Character.isUpperCase char문자를 소문자로
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        System.out.println(answer);
    }
}
