package study.Inflearn.array3;

import java.util.Scanner;

public class P9격자판최대합_풀이 { //30분 이상
    public int solution(int n, int[][] arr) {
        int answer = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = 0; sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; //1. 각 열의 합(세로)
                sum2 += arr[j][i]; //2. 각 행의 합(가로)
            }
            //최댓값 구하기
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }

        sum1 = 0; sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i]; //3. 오른쪽 아래로 내려가는 대각선 힙
            sum2 += arr[i][n-i-1]; //4. 왼쪽 아래로 내려가는 대각선 합
        }
        // 최댓값 구하기
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return answer;
    }

    public static void main(String[] args) {
        P9격자판최대합_풀이 T = new P9격자판최대합_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
