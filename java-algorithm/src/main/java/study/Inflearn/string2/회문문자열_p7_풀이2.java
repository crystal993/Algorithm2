package study.Inflearn.string2;

import java.util.Scanner;

public class 회문문자열_p7_풀이2 {
    public String solution(String str){
        String answer ="YES";

        //1. StringBuilder로 단어 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();

        //2. 뒤집은 단어와 입력한 단어 비교
        if(!tmp.equalsIgnoreCase(str)) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        회문문자열_p7_풀이2 T = new 회문문자열_p7_풀이2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
