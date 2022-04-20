package study.Inflearn.string2;

import java.util.Scanner;

public class 회문문자열_p7_풀이 {
    public String solution(String str){
        String answer ="YES";

        //1. 소문자나 대문자로 바꿔주기
        str = str.toLowerCase();

        //2. 앞과 뒤 비교
        int len = str.length(); //길이
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        회문문자열_p7_풀이 T = new 회문문자열_p7_풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
