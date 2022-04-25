package study.Inflearn.ArrayWrongAnswer;

import java.util.Scanner;

public class P10봉우리 {

    public static void main(String[] args) { //12분
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n+2][n+2];

        int dx[] = {0, 0, -1, 1}; //상 하 좌 우
        int dy[] = {-1, 1, 0, 0}; //상 하 좌 우

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean flag = false; // int cnt = 0; cnt가 4개이면 answer++하는 풀이도 됨.
        int answer=0;
        //1.봉우리 갯수 구하기
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                 flag = false; //4방향 모두다 큰지 카운팅하는 변수
                for (int k = 0; k < 4; k++) { //4방향 탐색
                    // 4방향 모두 다 크면 true
                    if(arr[i][j] > arr[i-dx[k]][j-dy[k]]) flag=true;
                    else { //아니면 false
                        flag=false;
                        break;  //더 탐색할 필요 없음.
                    }
                }
                if(flag) answer++; //4방향 모두 다 큰 경우이다.
            }
        }
        System.out.println(answer);
    }
}
