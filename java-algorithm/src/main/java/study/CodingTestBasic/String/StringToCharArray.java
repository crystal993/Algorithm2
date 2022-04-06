package study.CodingTestBasic.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToCharArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //String을 char배열로 변환할 때, toCharArray() 메소드를 사용한다.
        char[] board = new char[5];

        //방법1 - String 입력을 char형 Array로 변환
//        for (int i = 0; i < 5; i++) {
//            board[i] = br.readLine().toCharArray();
//        }

        //방법2 - String to Char Array
        String str = "12345";
        board = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            System.out.println("board["+i+"] = " + board[i]);
        }

    }
}
