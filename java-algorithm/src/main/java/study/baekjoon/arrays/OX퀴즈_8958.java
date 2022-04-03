package study.baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 전체 횟수 입력 받음
        int n = Integer.parseInt(br.readLine());

        // 2. 횟수만큼 for문
        for(int i=0; i<n; i++){
            String results[] = br.readLine().split(""); //OX담는 String배열
            int score = 0; // 성적 총 합계 변수
            int s_cnt = 0; // 성적 개별 카운팅 변수

            //3. results에 있는 OX탐색
            for(int j=0; j<results.length; j++){

                // 4. O면 s_cnt 1씩 증가 후 총 합계에 누적
                if(results[j].equals("O")){
                    s_cnt++;
                    score += s_cnt; 
                } else { //5. X면 s_cnt 1로 초기화 후 총 합계에 누적
                    s_cnt = 0;
                    score += s_cnt;
                }
            }
            //5. 결과값 출력
            System.out.println(score);

        }
    }
}
