package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P10가장짧은문자거리 { //34분
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        char[] str = s[0].toCharArray();
        char ch = s[1].charAt(0);

        ArrayList<Integer> ch_idx = new ArrayList<>();

        //1. ch 인덱스만 있는 배열 만들기
        for (int i = 0; i < str.length; i++) {
            if(str[i] == ch) ch_idx.add(i);
        }

        //2. ch 인덱스들과 str의 인덱스들의 길이 차의 최솟값을 구하기
        int len = 0, min;
        for (int i = 0; i < str.length; i++) {
            min = Integer.MAX_VALUE;

            for (int j = 0; j < ch_idx.size(); j++) {
                len = Math.abs(ch_idx.get(j)-i);
                if(len<min) min=len;
            }

            System.out.print(min+" ");
        }
    }
}
