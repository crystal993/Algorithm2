package study.Inflearn.String2;

import java.util.Scanner;

public class 회문문자열_p7 {
    public String solution(String str){
        String answer ="";
        //1. 소문자나 대문자로 바꿔주기
        str = str.toLowerCase();

        //2. 앞과 뒤 비교
        int lt = 0, rt = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if(lt >= rt){ //종료조건
                break;
            }
            // 앞과 뒤가 같은지 검사
            // 맞을 경우 yes
            if(str.charAt(lt) == str.charAt(rt)){
                lt++;
                rt--;
                answer = "YES";
            }
            else{ // 다를 경우 no
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        회문문자열_p7 T = new 회문문자열_p7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
