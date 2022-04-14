package study.Inflearn.String1;

import java.util.Scanner;

public class 문자찾기_p1_풀이 {

    public int solution(String str, char t){
        int answer=0;

        //1. 대문자로 만들어준다.
        str = str.toUpperCase(); //String을 대문자로
        t = Character.toUpperCase(t); //char형을 대문자로

        //2. 찾을 때마다 증가시켜준다.
        // 방법1
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == t) answer++;
//        }
        // 방법2
        for(char x : str.toCharArray()){
            if(x==t){
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args){
        문자찾기_p1_풀이 T = new 문자찾기_p1_풀이();
        Scanner in = new Scanner(System.in);

        String input1 = in.nextLine(); //computerrott - 입력할 문자
        char ch = in.next().charAt(0); // 찾을 문자
        System.out.println(T.solution(input1,ch));
    }
}
