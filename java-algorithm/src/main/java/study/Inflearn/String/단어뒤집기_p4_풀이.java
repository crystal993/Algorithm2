package study.Inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기_p4_풀이 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //2. 단어 뒤집기, StringBuilder를 이용
        // StringBuilder(문자열).reverse().toString() : 문자열을 뒤집어준다.
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        단어뒤집기_p4_풀이 T = new 단어뒤집기_p4_풀이();
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
