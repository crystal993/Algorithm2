package study.Inflearn.ArrayWrongAnswer;

import java.util.Scanner;

public class P5소수 {
    // 에라토스테네스의 체
    // n까지의 int 배열을 만들어서
    // 인덱스를 숫자, 값을 소수(0) 인지 배수인지(1)판별
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; //0일 때 소수, 1일 때 배수

        int answer=0; // 소수의 갯수

        // 2부터 n까지의 소수 
        for (int i = 2; i < n; i++) {
            //1로 체크된 수는 전부 배수이다.
            //0인 값이 있다면 소수 갯수 1증가
            if(arr[i]==0) answer++; 
            for (int j = i; j < n; j = j+i) { //배수
                // i의 배수에 해당하는 수는 
                // 소수가 아니므로 1로 체크
                arr[j] = 1;
//                System.out.print(j+" "); //배수만 찍히는 거 확인 가능
            }
//            System.out.println();
        }
        System.out.println(answer);
    }
}
