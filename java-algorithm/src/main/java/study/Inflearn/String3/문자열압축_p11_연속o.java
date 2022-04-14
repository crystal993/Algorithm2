package study.Inflearn.String3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 문자열압축_p11_연속o { //20분
    public String solution(String str){
        String answer = "";
        str = str + " "; // 문자열 뒤에 빈 문자 하나 추가
        // 그래야 마지막 문자까지 탐색이 가능.
        int cnt = 1;

        // 2. 몇개인지 세는 로직
        for (int i = 0; i < str.length()-1; i++) {

            // 연속된 문자일 때 cnt 1증가
            if (str.charAt(i) == str.charAt(i+1)) cnt++;
            else { //연속되지 않을 때 
                answer += str.charAt(i); // 문자 추가 
                if(cnt > 1) answer += String.valueOf(cnt); // 1이상일 때 갯수 추가
                cnt = 1; //1로 초기화
            }

        }
        
        return answer;
    }
    public static void main(String[] args) throws IOException {
        문자열압축_p11_연속o T = new 문자열압축_p11_연속o();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
