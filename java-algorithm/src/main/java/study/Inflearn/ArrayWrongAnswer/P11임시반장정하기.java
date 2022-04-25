package study.Inflearn.ArrayWrongAnswer;

import java.util.Scanner;

public class P11임시반장정하기 {//12분
    // 같은 반이었던 학생수가 제일 많은 학생이 임시반장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //반의 학생 수
        // 1~5학년 때까지 몇반이었는지 나타내는 2차원 배열
        int arr[][] = new int[n+1][5];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //같은 반이었던 학생수가 제일 많은 학생이 임시반장
        //학생은 행 인덱스 [행][열]
        int answer = 0, cnt = 0, max=-1;
        for (int i = 1; i <= n; i++) {
            cnt = 0;
            for (int j = 1; j <= n; j++) {
                if(i!=j){
                    for (int k = 0; k < 5; k++) {
                        if(arr[i][k]==arr[j][k]) {
                            cnt++;
                            break; //break를 해줘야한다.
                            // 한 학생을 한번만 카운팅 하므로
                        }
                    }
                }
            }
            if(max<cnt) {//최댓값 구하기
                max = cnt;
                answer = i; //가장많은 학생과 같은반이었던 인덱스(학생번호)
            }
        }
        System.out.println(answer);
    }
}
