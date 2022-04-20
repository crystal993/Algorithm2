package study.Inflearn.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_에라토스테네스의체_p5 {
    public static void main(String[] args) throws IOException {
        소수_에라토스테네스의체_p5 T = new 소수_에라토스테네스의체_p5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1]; //0일 때 소수, 1일 때 배수
        for (int i = 2; i < n; i++) {
            if(ch[i]==0){//소수일 때
                answer++; //소수 카운팅 1 증가
                // i의 배수들을 다 1로 바꿔준다.
                for (int j = i; j <= n ; j=j+i) ch[j]=1; //배수일 때
            }
        }
        return answer;
    }
}
