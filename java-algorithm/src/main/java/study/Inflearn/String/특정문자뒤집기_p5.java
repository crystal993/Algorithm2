package study.Inflearn.String;

import java.util.Scanner;

public class 특정문자뒤집기_p5 {
    public String solution(String str){
        String answer = "";

        // 2. 문자열을 char배열로 변환
        char ch[] = str.toCharArray();

        // 3. lt, rt
        // lt는 문자열의 맨 앞
        // rt는 문자열의 맨 끝
        int lt = 0, rt = str.length() - 1;

        // 4. 특수문자는 그대로, 알파벳만 뒤집기
        while(lt < rt){
            // 5. 알파벳일 때 문자열 뒤집는 알고리즘
            // 값을 교환하는 알고리즘
            if(!Character.isAlphabetic(ch[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }

        //5. char배열을 String으로 변환
        // String.valueOf(char배열) : 문자열로 변환해준다.
        answer = String.valueOf(ch);
        return answer;
    }
    
    public static void main(String[] args) {
        특정문자뒤집기_p5 T = new 특정문자뒤집기_p5();
        Scanner sc = new Scanner(System.in);
        
        // 1. 문자열 입력받기 
        String str = sc.next();
        
        // 6. 결과 출력
        System.out.println(T.solution(str));
    }
}
