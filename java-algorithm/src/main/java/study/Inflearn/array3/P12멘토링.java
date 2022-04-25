package study.Inflearn.array3;

import java.util.Scanner;

public class P12멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4
        int m = sc.nextInt(); //3
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //4중포문
       int answer = 0;
        for (int i = 1; i <= n; i++) { //i 멘토 1~4
            for (int j = 1; j <= n; j++) {//j 멘티 1~4
                // (i,j)가 (멘토,멘티)가 될 수 있는지 카운팅하는 변수
                int cnt = 0;

                if(i != j){ // 멘토 멘티가 같은 학생이 아닐 때
                    // 멘토 멘티 검증
                    for (int k = 0; k < m; k++) {//m번째의 테스트
                        // i와 j의 등수 찾기
                        int pi = 0, pj = 0; // 등수를 넣을 변수
                        for (int l = 0; l < n; l++) {// 0~3까지의 등수 , 커질수록 등수는 낮음
                            if(arr[k][l] == i) pi = l; //등수를 pi에 넣어준다.
                            if(arr[k][l] == j) pj = l; //등수를 pj에 넣어준다.
                        }
                        if(pi<pj) cnt++; //등수가 pj가 낮을 때(인덱스가 클수록 낮은 등수)
                    }
                }
                // 예를 들어 i=3 j=1이 멘토-멘티 검증 횟수가  
                // 테스트케이스 3번과 같다면 (3,1)은 멘토-멘티 적합하므로
                // 1증가
                if(cnt==m) answer++;
            }
        }
        System.out.println(answer); //멘토와 멘티가 될 수 있는 경우의 수 출력
    }
}
