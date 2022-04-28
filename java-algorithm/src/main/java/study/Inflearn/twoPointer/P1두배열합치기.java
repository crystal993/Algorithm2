package study.Inflearn.twoPointer;

import java.util.ArrayList;
import java.util.Scanner;

public class P1두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2= new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> arr = new ArrayList<>();

        int p1 = 0, p2 = 0; //포인터
        while(p1<n && p2<m){ //종료조건 둘 중에 하나라도 false면 종료

            // 오름차순을 출력해야하므로
            // 둘 중에 더 작은 수를 넣는다.
            if(arr1[p1]>arr2[p2]) arr.add(arr2[p2++]);
             else arr.add(arr1[p1++]);
        }

        // 한 배열에 삽입이 끝나면
        // 다른 배열에 값이 남아 있을 수도 있음.
        while(p1<n) arr.add(arr1[p1++]);
        while(p2<m) arr.add(arr2[p2++]);

        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
