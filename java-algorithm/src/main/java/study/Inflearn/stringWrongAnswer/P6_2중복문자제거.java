package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6_2중복문자제거 {//2분 05초
    public static void main(String[] args)  throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        String strReversed = new StringBuilder(str).reverse().toString();

        if(str.equals(strReversed)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
