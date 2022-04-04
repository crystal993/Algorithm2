package study.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 알파벳찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 문자열 담을 배열 생성후 초기화
        String[] str = br.readLine().split("");

        //2. hashMap 알파벳(키) 문자열위치(값) 생성 후 초기화
        HashMap<String, Integer> a = new HashMap<String, Integer>();

        //3. 소문자 a ~ z 까지 키값 넣고, 값은 초기화 a:97 z:122
        for(int i=0; i<26; i++){
            char ch = 'a';
            ch += i;
            a.put(String.valueOf(ch), -1);
        }
        //4. 입력받은 문자의 위치를 hashmap에 값할당, 중복되는 수는 처음 등장하는 위치를 저장
        for(int i=0; i< str.length; i++){
            for (int j = 0; j < a.size(); j++) {
                if(a.containsKey(str[i]) && a.get(str[i])==-1){ // a에 str[i]키가 있다면, 값이 -1일 떼
                    a.put(str[i],i); // 해당되는 키값에 위치 넣기
                }
            }
        }
        //출력
        for(int i=0; i<26; i++){
            char ch = 'a';
            ch += i;
            System.out.print(a.get(String.valueOf(ch))+" ");
        }

    }
}
