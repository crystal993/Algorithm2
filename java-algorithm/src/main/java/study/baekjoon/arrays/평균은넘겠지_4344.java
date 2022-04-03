package study.baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균은넘겠지_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for(int i=0; i<C; i++){
            String scores[] = br.readLine().split(" ");
            int n = Integer.parseInt(scores[0]);
            int score_avg=0;

            // 1. 평균 구하기
            for(int j=1; j<=n; j++){
                score_avg+=Integer.parseInt(scores[j]);
            }
            score_avg = score_avg/n;

            // 2. 평균넘는 학생 수 구하기
            double cnt =0;
            for(int j=1; j<=n; j++){
                if(Integer.parseInt(scores[j])>score_avg){
                    cnt+=1;
                }
            }

            // 3. 평균이 넘는 학생의 비율 구하기 , 소수점 셋째자리
            double result = cnt/n*100;
            System.out.println(String.format("%.3f",result)+"%"); // String.format("%.3f",result), 소수점 셋째자리
        }
    }
}
