package study.Inflearn.array3;

import java.util.Scanner;

public class P10봉우리_풀이 {
    // 상 우 하 좌
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int n, int[][] arr){
        int answer=0;
        // 봉우리 탐색하는 알고리즘
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag=true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag=false; //봉우리 아니면
                        break; // 굳이 4방향 탐색할 필요없으니 break
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P10봉우리_풀이 T = new P10봉우리_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }

}
