package study.baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력값 담기
        int n = Integer.parseInt(br.readLine()); // n
        String scores[] = br.readLine().split(" "); // 점수

        //2. 성적 중에 최댓값 구하기
        int avg = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int score = Integer.parseInt(scores[i]);
            System.out.println("score = " + score);
            if(max<score){
                max = score;
            }
        }
        System.out.println("max = " + max);
        // 3. 새로운 성적의 평균 구하기 
        double newAvg = 0;
        for(int i=0; i<n; i++){
           double newScore = Double.valueOf(scores[i])/max*100; // 오류 - 소수점이 다 잘려서 0으로 결과값이 출력된다. (Integer.parseInt(scores[i])/max)*100;
            newAvg += newScore;
        }
        System.out.println("newAvg = " + newAvg);
        System.out.println(newAvg / n);
    }
}
