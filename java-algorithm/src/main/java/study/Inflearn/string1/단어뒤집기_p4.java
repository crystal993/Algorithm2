package study.Inflearn.string1;

import java.util.Scanner;

public class 단어뒤집기_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //반복횟수
        String str;
        
        // 1.n+1만큼 반복
        for (int i = 0; i < n+1; i++) {
            str = sc.next(); //입력단어 nextLine()은 오류 났었음.
            String answer = ""; // 뒤집은 단어
            // 2. 입력받은 str을 char배열로 변환
            char[] ch = str.toCharArray(); // str을 char배열로

            //3. char배열 뒤에서부터 탐색해서 단어뒤집기
            for (int j = ch.length-1; j > -1 ; j--) {
                answer += ch[j];
            }

            // 4.출력
            System.out.println(answer);
        }
    }
}
