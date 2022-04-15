package study.Inflearn.Array;

import java.util.Scanner;

public class 가위바위보_p3 { //20분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int AB[][] = new int[2][n];

        // 1. A가 낸 회차를 저장하는 로직
        for (int i = 0; i < n; i++) {
            AB[0][i] = sc.nextInt();
        }
        
        // 2. B가 낸 회차를 저장하는 로직
        for (int i = 0; i < n; i++) {
            AB[1][i] = sc.nextInt();
        }

        // 3. 가위바위보 로직
        int A = 0, B = 0; //A,B가 낸 거 담는 변수
        for (int i = 0; i < n; i++) { //n회차만큼 반복
            A = AB[0][i]; //A가 낸 거
            B = AB[1][i]; //B가 낸 거

            if(A == B){ //비겼을 때 
                System.out.println('D');
             // //가위 vs 바위   //바위 vs 보 에서 B가 이긴 경우   
            } else if(Math.abs(A - B) == 1 && A < B ){ 
                System.out.println('B');
            // //가위 vs 보 에서 B가 이긴 경우
            } else if(Math.abs(A - B) == 2 && A > B ){
                System.out.println('B');
            // 나머지 A가 이긴 경우
            } else {
                System.out.println('A');
            }

        }
    }
}
