package study.Inflearn.String;

import java.util.HashSet;
import java.util.Scanner;

public class 중복문자제거_p6 {
    public String solution(String str){
        String answer = "";
        for(int i=0; i< str.length(); i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));

            // 1. 현재 인덱스와 그 문자가 처음 나오는 인덱스가 같을 때
            // indexOf(찾을 문자) : 그 문자가 처음 나오는 인덱스를 반환
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        중복문자제거_p6 T = new 중복문자제거_p6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
