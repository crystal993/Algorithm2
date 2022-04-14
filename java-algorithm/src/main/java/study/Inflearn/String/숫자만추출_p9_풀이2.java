package study.Inflearn.String;

import java.util.Scanner;

public class 숫자만추출_p9_풀이2 {
    public int solution(String str){
        String answer="";
        // isDigit으로 풀이
        for(char x : str.toCharArray()){
            // 숫자일 때
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        숫자만추출_p9_풀이2 T = new 숫자만추출_p9_풀이2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
