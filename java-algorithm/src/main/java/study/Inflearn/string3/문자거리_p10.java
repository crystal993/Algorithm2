package study.Inflearn.string3;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자거리_p10 { //20분
    public int[] solution(String s, String t){
        int[] answer = new int[s.length()]; //정답
        char[] ch = s.toCharArray(); // ch배열로 변환
        ArrayList<Integer> fidx = new ArrayList<Integer>(); //찾을 문자의 인덱스를 저장할 배열

        // 1. 찾을 문자들의 인덱스를 저장
        // 예를들어 e라면 e에 해당되는 인덱스를 저장
        for (int i=0; i<s.length(); i++) {
            if(t.equals(String.valueOf(ch[i]))){
                fidx.add(i);
            }
        }

        //2. 찾을 문자들의 인덱스와 원래 인덱스를 빼서 최솟값을 저장
        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;

            // 찾을 문자들의 인덱스 만큼 반복
            for (int j = 0; j < fidx.size(); j++) {
                // 3. 두 인덱스 사이의 거리의 절댓값을 구한다.
                int len = Math.abs(i - fidx.get(j));

                //4. 인덱스 사이의 거리의 최솟값을 저장
                if(len < min){
                    min = len;
                }
            }
            // 5. 정답배열에 min값(인덱스 사이의 거리의 최솟값) 저장
            answer[i] = min;
        }

        return answer;
    }
    public static void main(String[] args) {
        문자거리_p10 T = new 문자거리_p10();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i : T.solution(s, t)) {
            System.out.print(i+" ");
        }
    }

}
