package study.Programmers.twoArray;
import java.util.*;

public class k번째수 { //lv1
    class Solution {
        public int[] solution(int[] arr, int[][] commands) {
            int[] answer = new int[commands.length];
            int idx_i = 0; //자를 시작 인덱스
            int k = 0; //k번째
            int idx_j = 0; // 배열 자르는 끔 인덱스
            int[] temp; //idx_i-1 ~ idx_j 까지 배열 자른 값 넣을 배열


            for(int i=0; i<commands.length ; i++){
                idx_i = commands[i][0]; //시작 i번째 숫자, commands[][0] 은 1부터 시작하므로 1을 빼줘야 한다.
                idx_j = commands[i][1]; //끝 j번째 숫자
                k = commands[i][2]; //찾아야 할 k번째 수

                //Arrays.copyOfRange(배열, 시작인덱스, 끝인덱스) 실제범위(시작인덱스 ~ 끝인덱스 - 1 )
                temp = Arrays.copyOfRange(arr,idx_i-1,idx_j); //인덱스는 0부터 돌아가므로 (i번째 수-1) ~ (j번째수-1)
                Arrays.sort(temp); //배열 정렬 Arrays.sort(배열)
                answer[i]=temp[k-1]; //k번째는 1부터 시작, 인덱스는 0부터 시작, k-1해주기
            }
            return answer;
        }
    }
}
