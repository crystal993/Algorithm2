package study.Inflearn.Array2;

import java.util.Scanner;

public class 등수구하기_p8_풀이 {
    public int[] solution(int n, int[] scores) {
        int[] answer = new int[n];
        int cnt;

        for (int i = 0; i < n; i++) {
            cnt = 1;
            for (int j = 0; j < n; j++) {
                if (scores[i]<scores[j]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        등수구하기_p8_풀이 T = new 등수구하기_p8_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        for (int x : T.solution(n,scores)) {
            System.out.print(x+" ");
        }
    }
}
