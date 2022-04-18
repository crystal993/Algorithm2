package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_2단어뒤집기{ //2분 18초
    // 단어를 뒤에서부터 탐색해서 뒤집는 방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String answer;
        for (int i = 0; i < n; i++) {
            char[] str = br.readLine().toCharArray();
            answer = "";

            for (int j = str.length-1; j >= 0; j--) {
                answer += str[j];
            }

            System.out.println(answer);
        }
    }
}
