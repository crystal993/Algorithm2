package study.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 입력값 받는 변수
        int arr[] = new int[26]; // 알파벳 갯수 증가시키는 변수

        // 1. 쓰인 알파벳의 수를 저장
        for(int i=0; i<str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <='Z'){ //대문자 범위 
                arr[str.charAt(i)-'A']++;
            } else { //소문자 범위
                arr[str.charAt(i)-'a']++;
            }
        }
        
        //2. 많이 쓰인 알파벳 찾기 
        int max = -1;
        char ch ='?';

        for (int i = 0; i < arr.length; i++) {
          if(max < arr[i]) {
              max = arr[i];
              ch = (char)('A' + i) ; //꼭 형변환해주기, 숫자 출력
          } else if(max == arr[i]) {
              ch ='?';
          }

        }
        System.out.println(ch);


    }
}
