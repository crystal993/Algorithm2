package study.Inflearn.Array;

import java.util.Scanner;

public class 가위바위보_p3_풀이 { //20분
    public String solution(int n, int[] a, int[] b){
        String answer = "";

        // 3. 가위바위보 로직
        for (int i = 0; i < n; i++) {
            // 비긴 경우
            if(a[i]==b[i]) answer += "D";
            // 가위 vs 보 - A가 이긴 경우
            else if(a[i]==1 && b[i]==3) answer += "A";
            // 바위 vs 가위 - A가 이긴 경우
            else if(a[i]==2 && b[i]==1) answer += "A";
            // 보 VS 바위 - A가 이긴 경우
            else if(a[i]==3 && b[i]==2) answer += "A";
            // 나머지 B가 이긴 경우
            else answer += "B";
        }

        return answer;
    }
    public static void main(String[] args) {
        가위바위보_p3_풀이 T = new 가위바위보_p3_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];

        // 1. A가 낸 회차를 저장하는 로직
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        // 2. B가 낸 회차를 저장하는 로직
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        // 4. 출력
        for (char x : T.solution(n,A,B).toCharArray()) {
            System.out.println(x);
        }
    }
}
