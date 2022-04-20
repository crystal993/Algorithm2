package study.Inflearn.array1;

import java.util.Scanner;

public class 큰수출력하기_p1 {

    public static void main(String[] args) {
        큰수출력하기_p1 T = new 큰수출력하기_p1();
        Scanner sc = new Scanner(System.in);

        String answer = "";
        int n = Integer.parseInt(sc.next());
        int pre = -1;

        for (int i = 0; i < n; i++) {
            int af = Integer.parseInt(sc.next());
            if(af > pre) answer += (String.valueOf(af) + " ");
            pre = af;
        }
        System.out.println(answer);
    }
}
