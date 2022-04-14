package study.Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 문자열압축_p11_연속x { //20분
    public String solution(String str){
        String answer = "";
        char key = str.charAt(0);
        int cnt;
        //1. 중복을 제거한 str 
        String keys = "";
        for (int i = 0; i < str.length(); i++) {
            if(i == str.indexOf(str.charAt(i)))
            {
                keys += String.valueOf(str.charAt(i));
            }
        }
        
        // 2. 몇개인지 세는 로직
        String[] tmp = keys.split(""); //str 중복제거

        for (int i = 0; i < tmp.length; i++) {
            String key2 = tmp[i];
            cnt = 0;
            answer += key2;

            for (int j = 0; j < str.length(); j++) {
                String val = String.valueOf(str.charAt(j));

                if(key2.equals(val)){
                    cnt++;
                }
            }
            if(cnt > 1) answer += String.valueOf(cnt);
        }
        
        return answer;
    }
    public static void main(String[] args) throws IOException {
        문자열압축_p11_연속x T = new 문자열압축_p11_연속x();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
