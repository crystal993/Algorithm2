package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5특정문자뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
        char[] str = br.readLine().toCharArray();

        int lt = 0, rt = str.length-1;

        while (lt < rt){
            if(!Character.isAlphabetic(str[lt])) {
                lt++;
            }
            else if(!Character.isAlphabetic(str[rt])) {
                rt--;
            }
            else {
                char tmp = str[lt];
                str[lt] = str[rt];
                str[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(str));
    }
}
