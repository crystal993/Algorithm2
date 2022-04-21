package study.Inflearn.array3;

import java.util.Scanner;

public class P11임시반장정하기_풀이 { //33분이상
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        // 학생
        for (int i = 1; i < n+1; i++) {
            int cnt = 0;
            // 비교할 학생
            for (int j = 1; j < n+1; j++) {
                // 학년
                for (int k = 1; k <= 5; k++) {
                    // 자기자신 비교해도 상관없다
                    // 어차피 가장 많이 같은 반이 겹쳤던 학생 출력하므로
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; //break를 해줘야한다.
                        // 한 학생을 한번만 카운팅 해야하므로
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P11임시반장정하기_풀이 T = new P11임시반장정하기_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n+1][6];
        // 0번학생은 없으므로 1번학생 부터 카운팅
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }
}
