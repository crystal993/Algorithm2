package study.Inflearn.array2;

import java.util.Scanner;

public class 등수구하기_p8 { //28분 33초
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        // 1. 입력받기
        int n = sc.nextInt(); // 1. 점수 개수
        int[] scores = new int[n]; //점수를 저장할 배열
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt(); // 2. 점수 입력받기
        }

        // 2. 등수를 저장할 배열의 모든 값을 1로 초기화
        int th[] = new int[n+1];
        for (int i = 0; i < th.length; i++) {
            th[i] = 1;
        }

        // 3. 등수를 계산하는 알고리즘
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // scores[j]가 scores[i]보다 큰 경우에만 1증가하면
                // score[i]의 등수가 된다
                if(scores[i]<scores[j]) {
                    th[i]+=1;
                }
            }
        }
        // 4. score[]가 입력된 순서대로
        // th[i] 등수를 출력한다.
        for (int i = 0; i < th.length-1; i++) {
            System.out.print(th[i]+" ");
        }
    }
}
