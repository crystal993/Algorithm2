package study.Inflearn.Array;

import java.util.Scanner;

public class 보이는학생_p2_풀이 { //9분
    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){ //큰 경우
                answer++; //갯수 1 증가
                max=arr[i]; // 더 큰 값 넣기
            }
        }
        return answer;
    }
    // 값이 큰 경우가 몇번인지 세는 문제이다.
    public static void main(String[] args) {
        보이는학생_p2_풀이 T = new 보이는학생_p2_풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; //동적으로 할당
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();//하나씩 집어넣기
        }
        System.out.println(T.solution(n, arr));
    }
}
