package study.Inflearn.String3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호_p12_풀이 {
    public String solution(int n, String str){
        String answer = "";

        int len = str.length()/n; //자를 길이
        int idx1 = 0, idx2 = 7; //문자 자를 시작, 끝 인덱스
        String s;

        for (int i = 0; i < n; i++) {
            //1. 한 단어로 자르기
            //2. #은 1로 *은 0으로 2진수화
            s = str.substring(idx1,idx2).replace("#","1").replace("*","0");

            //3. 2진수 -> 10진수
            int num = Integer.parseInt(s,2);
//            System.out.println("s = " + s +"num = " + num);

            //4. 10진수 -> 아스키코드
            char ch = (char)num;

            //5. 문자 더하기
            answer += ch;
            idx1 = idx2; //인덱스 시작위치
            idx2 += len; //인덱스 끝 위치
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        암호_p12_풀이 T = new 암호_p12_풀이();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(T.solution(n, str));
    }
}
