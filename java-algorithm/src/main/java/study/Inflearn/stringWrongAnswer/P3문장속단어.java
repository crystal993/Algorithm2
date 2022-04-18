package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3문장속단어 { //4분 44초
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 문장을 입력 받는다.
        String[] str = br.readLine().split(" ");

        String answer = ""; //정답
        int max = -1; // 단어의 길이 최댓값 저장할 변수

        // 2. 문장의 단어 수만큼 탐색
        // 각 문자열의 최댓값을 구하기 
        for (int i = 0; i < str.length; i++) {
            // 3. 단어의 길이의 최댓값을 구하고 
            // 정답변수에 그 단어를 저장
            if(max < str[i].length()){
                max = str[i].length();
                answer = str[i];
            }
        }
        System.out.println(answer);
    }
}
