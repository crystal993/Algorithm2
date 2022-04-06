package study.CodingTestBasic.Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        // Array를 정렬하고자 할 때, Arrays.sort(배열명) 메소드를 사용한다.
        int[] Arr = {2,4,5,1,3};
        
        Arrays.sort(Arr); // 정렬
        
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Arr["+i+"] = " + Arr[i]);
        }

    }
}
