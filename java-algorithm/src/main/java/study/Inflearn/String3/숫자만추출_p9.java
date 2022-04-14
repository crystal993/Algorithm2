package study.Inflearn.String3;

import java.util.Scanner;

public class 숫자만추출_p9 { //10분
    public int solution(String str){
        String tmp = "";
        //1. 숫자만 추출해서 answer에 더하기
        for (int i = 0; i < str.length(); i++) {
            // 2. 문자가 아닐 때
            if(!Character.isAlphabetic(str.charAt(i))){
                tmp += str.charAt(i);
            }
        }
        //3. 형변환
        int result = Integer.parseInt(tmp);
        return result;
    }
    public static void main(String[] args) {
        숫자만추출_p9 T = new 숫자만추출_p9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
