package study.Inflearn.String1;

import java.util.Scanner;

public class 대소문자변환_p2_풀이2 {
    public static void main(String[] args) {
        // 풀이3 - 아스키코드로 풀이
        // 대문자 A~Z 65~90
        // 소문자 a~z 97~122
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String answer = "";

        // 대문자 -> 소문자, 소문자-> 대문자
        for(char x : str.toCharArray()){
            if(x >= 'A' && x <= 'Z') answer += (char)(x+('a'-'A')); //대문자 -> 소문자
            else answer += (char)(x-('a'-'A')); //소문자 -> 대문자
        }
        System.out.println(answer);
    }
}
