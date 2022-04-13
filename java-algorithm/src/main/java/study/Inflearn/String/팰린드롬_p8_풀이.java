package study.Inflearn.String;

import java.util.Scanner;

public class 팰린드롬_p8_풀이 {
    public String solution(String str){
        String answer = "NO";
        // 1. 대문자로 치환
        // 2. 정규식으로 특수문자 제거
        str = str.toUpperCase().replaceAll("[^A-Z]","");

        // 3. 단어 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();

        // 4. 같은지 비교
        if(tmp.equals(str)) answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        팰린드롬_p8_풀이 T = new 팰린드롬_p8_풀이();
        Scanner sc = new Scanner(System.in);
//        String str = sc.next(); //공백 이후의 문자는 잘린다.
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
