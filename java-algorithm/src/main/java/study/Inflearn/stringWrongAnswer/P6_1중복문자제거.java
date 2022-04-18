package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class P6_1중복문자제거 { // 약 7분
    public static void main(String[] args)  throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력받은 문자열을 소문자로 변환
        char[] str = br.readLine().toLowerCase().toCharArray();

        // 2. 회문문자열 다르면 NO, 맞으면 YES
        int lt = 0, rt = str.length - 1;
        String answer = "YES";
        while(lt < rt) { //lt랑 rt가 같거나 크면 멈춤
            if(str[lt]!=str[rt]){ //서로 다를 때
                answer = "NO"; //NO로 바꾼후 브레이크문
                break;
            }
            lt++;
            rt--;
            answer = "YES";
        }
        System.out.println(answer);
    }
}
