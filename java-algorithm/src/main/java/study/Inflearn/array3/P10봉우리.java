package study.Inflearn.array3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class P10봉우리 { //20분
    // 2. 봉우리 탐색
    // 상 [i-1][j]
    // 하 [i+1][j]
    // 좌 [i][j-1]
    // 우 [i][j+1]
    // 2중 포문으로 탐색, 둘다 범위 1~n-1
    // cnt로 봉우리 갯수
    // 상하좌우 값보다 큰 경우에 봉우리 +1
    public int solution(int n, int[][] arr) {
        int cnt=0;
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                if(arr[i-1][j] < arr[i][j] && arr[i+1][j] < arr[i][j] && arr[i][j-1] < arr[i][j] && arr[i][j+1] < arr[i][j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // 1. 가장자리 0으로 초기화
    // [0][j] [i][0] [n][j] [i][n]
    public static void main(String[] args) throws IOException {
        P10봉우리 T = new P10봉우리();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = n+2;
        int arr[][] = new int[idx][idx];

        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx; j++) {
                if(i < idx-1 && i > 0) {
                    if (j < idx-1 && j > 0) {
                        arr[i][j] = sc.nextInt();
                    }
                } else {
                    arr[i][j] = 0;
                }
            }
        }

//        for (int i = 0; i < idx; i++) {
//            for (int j = 0; j < idx; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(T.solution(idx,arr));
    }

}
