package study.Inflearn.string3;

import java.util.Scanner;

public class 숫자만추출_p9_풀이 {
    public int solution(String str){
        int answer=0;
        // 아스키코드로 풀이
        // 0 ~ 9 까지의 아스키코드, 48 ~ 57
        for(char x : str.toCharArray()){
            // 숫자일 때
            if(x>=48 && x<=57) answer=answer*10+(x-48);
        }
        return answer;
    }
    public static void main(String[] args) {
        숫자만추출_p9_풀이 T = new 숫자만추출_p9_풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
