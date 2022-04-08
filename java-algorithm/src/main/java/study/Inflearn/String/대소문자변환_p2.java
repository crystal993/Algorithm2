package study.Inflearn.String;

import java.util.Locale;
import java.util.Scanner;

public class 대소문자변환_p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().split("");
        char ch = 'a';
        String answer = "";

        for (int i = 0; i < str.length; i++) {
            //소문자일 때 (소문자 -> 대문자)
            if(str[i].charAt(0) >= ch && str[i].charAt(0) <= ch+26){
//                str[i] = String.valueOf((char)(ch - 26));
                  str[i] = str[i].toUpperCase();
            // 대문자일 때 (대문자 -> 소문자)
            } else {
//                str[i] = String.valueOf((char)(ch - 26));
                str[i] = str[i].toLowerCase();
            }
            answer += str[i];
        }
        System.out.println(answer);
    }
}
