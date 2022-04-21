package study.Inflearn.array3;

import java.util.Scanner;

public class P11임시반장정하기 { //33분이상
    //[s][0] 1번 학생 [0][0] 2번 학생 [1][0]
    // [0][grade] 1학년 [0][0] 2학년 [0][1]
    // 같은 학년일 때 같은 숫자가 있으면 answer++
    public int solution(int n, int[][] arr) {
        int answer = 1; //1번학생부터 시작
        int max = 0;
        int check[] = new int[n];
        // 학생
        for (int i = 0; i < n; i++) {
            // 비교할 학생
            for (int j = 0; j < n; j++) {
                // 학년
                for (int k = 0; k < 5; k++) {
                    // 자기자신 비교해도 상관없다
                    // 어차피 가장 많이 같은 반이 겹쳤던 학생 출력하므로
                    if( i!=j && arr[i][k] == arr[j][k]) {
                        check[i]++;
                        break; //break를 해줘야한다.
                        // 한 학생을 한번만 카운팅 해야하므로
                    }
                }
            }
        }

        for (int student = 0; student < n; student++) {
            if(check[student]>max) {
                max = check[student];
                answer = student+1; //인덱스는 0부터시작, 학생은 1번부터 시작
            } 
        }

        return answer;
    }

    public static void main(String[] args) {
        P11임시반장정하기 T = new P11임시반장정하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }
}
