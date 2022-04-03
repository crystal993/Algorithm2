package study.baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균은넘겠지_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 반복문 횟수 입력값으로 받기
        int C = Integer.parseInt(br.readLine());

        // 전체 반복문
        for(int i=0; i<C; i++){


            String scores[] = br.readLine().split(" "); //점수 String배열에 저장, 단scores[0]에는 전체 성적갯수 존재, 성적은 scores[1]부터 배열끝까지만 존재
            int n = Integer.parseInt(scores[0]); //전체 성적의 개수
            int score_avg=0; //평균 담을 변수

            // 1. 평균 구하기, 인덱스 1부터 n까지
            for(int j=1; j<=n; j++){
                score_avg+=Integer.parseInt(scores[j]);
            }
            score_avg = score_avg/n;

            // 2. 평균넘는 학생 수 구하기, 인덱스 1부터 n까지
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
