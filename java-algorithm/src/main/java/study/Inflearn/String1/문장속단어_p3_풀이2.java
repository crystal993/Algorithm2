package study.Inflearn.String1;

import java.util.Scanner;

public class 문장속단어_p3_풀이2 {
    public String solution(String str){
        String answer=""; // 가장 길이가 긴 단어를 저장하기 위해 만듬
        int m = Integer.MIN_VALUE, pos; //가장 작은 값으로 초기화가 된다.

        // 1. ' '가 있는 인덱스가 -1이 아닐때
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){ //>=하면 안된다. 뒤에 거가 갱신이 됨.
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }
        //3.마지막 단어가 못들어갈 때가 있어서 처리를 해줘야 한다.
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        문장속단어_p3_풀이2 T = new 문장속단어_p3_풀이2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
