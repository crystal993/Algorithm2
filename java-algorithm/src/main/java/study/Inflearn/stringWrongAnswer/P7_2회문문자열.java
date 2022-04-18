package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7_2회문문자열 { //1분 51초
    public static void main(String[] args)  throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // 1. 소문자로 변환
        String str = br.readLine().toLowerCase();
        // 2. str을 뒤집기
        String strReversed = new StringBuilder(str).reverse().toString();

        // 3. 같으면 yes, 다르면 no
        if(str.equals(strReversed)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
