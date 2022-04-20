package study.Inflearn.string1;
import java.util.Scanner;

public class 문자찾기_p1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String input1 = in.nextLine(); //computerrott - 입력할 문자
        String input2 = in.nextLine(); //t - 찾을 문자

        // 1. 소문자로 변환한다.
        // 문자열이름.toLowerCase()
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        int cnt = 0;  //찾을 문자 카운팅하는 변수
        char ch = input2.charAt(0); //찾을 문자값 넣음

        // 2. 문자열에서 문자 뽑기
        // 문자열이름.CharAt(인덱스)
        for(int i=0; i<input1.length(); i++){
            if(ch == input1.charAt(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
