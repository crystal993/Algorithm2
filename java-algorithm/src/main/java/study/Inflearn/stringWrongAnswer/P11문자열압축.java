package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11문자열압축 { //22분
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 문자열 입력받기
        String str = br.readLine();
        str += " "; // 공백을 더해줘야 끝까지 탐색한다.
        String answer = "";

        int cnt = 1; //갯수 카운팅
        // 2. 1부터 문자열+1 만큼 반복
        for (int i = 0; i < str.length()-1; i++) {
            // 3. 앞의 문자와 뒤의 문자가 같을 때 cnt 1증가
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else { //4. 다를 때
                // 5. answer에 문자 더하면 1번만 더해진다.
                answer += str.charAt(i);
                if(cnt > 1) answer += cnt; //6. 같을 때 연속적으로 카운팅한 cnt가 1번만 더해진다.
                cnt = 1; // 7. 다시 cnt 1로 초기화
            }
        }
        System.out.println(answer);
    }
}
