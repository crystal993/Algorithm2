package study.Inflearn.String;

import java.util.Scanner;

public class 문장속단어_p3_풀이 {
    public String solution(String str){
        String answer=""; // 가장 길이가 긴 단어를 저장하기 위해 만듬
        int m = Integer.MIN_VALUE; //가장 작은 값으로 초기화가 된다.

        //1. 문장의 각 단어를 분리
        String[] s = str.split(" ");
        for(String x : s){

            //2. 길이 최댓값 구하기
            int len = x.length();
            if(len > m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문장속단어_p3_풀이 T = new 문장속단어_p3_풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
