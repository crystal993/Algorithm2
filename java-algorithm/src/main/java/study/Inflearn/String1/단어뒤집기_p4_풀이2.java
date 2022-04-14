package study.Inflearn.String1;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기_p4_풀이2 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //2. 단어 뒤집기, 각각의 문자열을 char배열로 만들어서
        // lt는 단어의 맨 앞 문자 
        // rt는 단어의 맨 끝 문자
        // 계속 lt와 rt를 바꾸는 구조
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;

            // lt와 rt가 같을 때 반복문 종료
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            } // 값을 교환하는 알고리즘

            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        단어뒤집기_p4_풀이2 T = new 단어뒤집기_p4_풀이2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        // 1.n개의 단어를 스트링 배열에다가 넣는다.
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }

        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
