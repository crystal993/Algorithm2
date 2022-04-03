package study.baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 나머지_3052_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. hashset 선언 - 중복을 제거해준다.
        HashSet<Integer> hashset = new HashSet<Integer>();

        // 2. N%42 한 값을 hashSet에 저장
        for(int i=0; i<10; i++){
            hashset.add((Integer.parseInt(br.readLine()))% 42);
        }
        // 3. 갯수출력
        System.out.println(hashset.size());
    }
}

