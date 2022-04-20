package study.Inflearn.array3;

import java.util.Scanner;

public class P9격자판최대합 { //30분 이상
    public int solution(int n, int[][] arr) {
        int answer = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = 0; sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
//                System.out.println("arr["+j+"]["+i+"] :"+arr[j][i]);
            }
            if( answer < sum1 || answer < sum2){
                if( sum2 < sum1){
                    answer = sum1;
                } else {
                    answer = sum2;
                }
            }

        }

        sum1 = 0; sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
//            System.out.println("arr["+i+"]["+i+"] :"+arr[i][i]);
//            System.out.println("arr["+(n-i-1)+"]["+(n-i-1)+"] :"+arr[(n-i-1)][(n-i-1)]);
        }
        if( answer < sum1 || answer < sum2){
            if( sum2 < sum1){
                answer = sum1;
            } else {
                answer = sum2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P9격자판최대합 T = new P9격자판최대합();
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
