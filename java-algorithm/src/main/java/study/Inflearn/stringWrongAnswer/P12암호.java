package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String answer = "";
        int num = 0;
        int sidx = 0, fidx = (int) str.length() / n;


        for (int i = 0; i < n; i++) {

            // 0. 7글자씩 자르기
            // subString(i, j) : 실제범위 : i ~ j-1
            String tmp = str.substring(sidx,fidx);

            // 1. 2진수화하기
            //    #은 1로 *은 0으로
            // replace('oldChar','newChar')
            tmp = tmp.replace('#','1').replace('*','0');

            // 2. 10진수화하기
            // Integer.parseInf(str,진수)
            num = Integer.parseInt(tmp, 2);

            // 3. char로 변환하기
            answer += (char)num;
            // 4. 카운팅
            sidx = fidx;
            fidx = fidx + (int) str.length() / n;
        }
        System.out.println(answer);
    }
}
