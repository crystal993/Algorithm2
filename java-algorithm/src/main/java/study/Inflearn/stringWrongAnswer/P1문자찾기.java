package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1문자찾기 { //4분
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch = br.readLine().charAt(0);

        // 1. 소문자로 바꾼다.
        str = str.toLowerCase();
        char ch2 = Character.toLowerCase(ch);

        // 2. 해당문자의 갯수를 체크한다.
        int cnt = 0;
        for (char x : str.toCharArray()) {
            if (x == ch2) { //문자를 찾으면
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
