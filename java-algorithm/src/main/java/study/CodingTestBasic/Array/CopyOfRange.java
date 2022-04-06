package study.CodingTestBasic.Array;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
       // 배열에서 특정 범위를 자르고, 다른 배열에 저장할 때
       // Arrays.copyOfRange(배열명,시작점,끝점)
       // 메소드를 사용한다.

       // 범위는 (시작 ~ 끝-1) 이다.

        int[] array = {1,2,3,4,5};
        
        int[] temp = Arrays.copyOfRange(array,1,3);
        // 2,3이 저장되었을 것
        
        System.out.println(array);
        System.out.println(temp);

        for (int i = 0; i < temp.length; i++) {
            System.out.println("temp["+i+"] = " + temp[i]);
        }

    }
}
