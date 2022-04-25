package study.Inflearn.ArrayWrongAnswer;

import java.util.Scanner;

public class P8등수구하기 {//9분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//점수 갯수
        int arr[] = new int[n]; //국어 점수
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //입력된 순서대로 등수를 출력한다.
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            cnt = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i]<arr[j]) cnt++;
            }
            System.out.print(cnt+" ");
        }
    }
}
