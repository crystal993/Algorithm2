package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_1단어뒤집기{ //13분
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. n을 입력받는다.
        int n = Integer.parseInt(br.readLine());

        // 2. n만큼 반복
        for (int i = 0; i < n; i++) {
            char[] str = br.readLine().toCharArray(); //단어를 char배열로 변환
            int lt =0, rt = str.length-1; //lt, rt
            
            // 3. 단어를 뒤집는 알고리즘
            while (lt < rt){ //lt가 rt보다 크거나 같으면 종료
                char tmp = str[lt];
                str[lt] = str[rt];
                str[rt] = tmp;
                lt++;
                rt--;
            }
            //4. 단어 출력
            System.out.println(String.valueOf(str));
        }
    }
}
