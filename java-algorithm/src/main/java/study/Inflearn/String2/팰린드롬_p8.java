package study.Inflearn.String2;

import java.util.Scanner;

public class 팰린드롬_p8 {
    public String solution(String str){
        String answer = "YES";

        // 1. str을 대문자로 변환
        // 2. replaceAll 정규식으로 영어대문자 외에는 제거
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        System.out.println(str);
        // 3. 비교
        int lt = 0, rt = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            if(lt >= rt){ //종료조건
                break;
            }
            // 앞과 뒤의 문자가 다를 때
            if(str.charAt(lt) != str.charAt(rt)){
                answer = "NO";
            }
            lt++; //탐색시 왼쪽 인덱스 1씩 증가
            rt--; //탐색시 오른쪽 인덱스 1씩 감소
        }

        return answer;
    }
    public static void main(String[] args) {
        팰린드롬_p8 T = new 팰린드롬_p8();
        Scanner sc = new Scanner(System.in);
//        String str = sc.next(); //공백 이후의 문자는 잘린다.
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
