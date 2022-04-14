package study.Inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자거리_p10_풀이 {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000; //거리, 처음에 엄청 큰 수를 넣는다.

        // 왼쪽에 존재하는 e를 기준으로 거리를 구함
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t){
                p = 0; // 자기자신과의 거리는 0
            } else { // 자기자신이 아닐 때 1증가
                p++;
                answer[i] = p;
            }
        }

        // 오른쪽에 존재하는 e를 기준으로 거리를 구한다. 
        p=1000;
        for (int i = s.length()-1; i>=0 ; i--) {
            if(s.charAt(i)==t){
                p = 0; // 자기자신과의 거리는 0
            } else { // 
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        문자거리_p10_풀이 T = new 문자거리_p10_풀이();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0); //char형 문자 받는 방법
        for (int i : T.solution(s, t)) {
            System.out.print(i+" ");
        }
    }

}
