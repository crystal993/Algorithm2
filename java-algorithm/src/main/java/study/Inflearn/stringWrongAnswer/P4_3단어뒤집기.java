package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_3단어뒤집기 { //50초
    // StringBuilder(문자열).reverse().toString();
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String str = new StringBuilder(br.readLine()).reverse().toString();
            System.out.println(str);
        }
    }

}
