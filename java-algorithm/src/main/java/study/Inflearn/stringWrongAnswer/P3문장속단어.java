package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3문장속단어 { //4분 44초
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        String answer = "";
        int max = -1;
        for (int i = 0; i < str.length; i++) {
            int lenCnt = 0;
            for (char x : str[i].toCharArray()) {
                lenCnt++;
            }
            if(max < lenCnt){
                max=lenCnt;
                answer=str[i];
            }
        }
        System.out.println(answer);
    }
}
