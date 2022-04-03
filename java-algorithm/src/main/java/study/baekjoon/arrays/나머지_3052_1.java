package study.baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 나머지_3052_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 10개의 주어진 숫자의 42로 나눈 나머지를 구한 후 A배열에 저잘
        int[] A = new int[10];
        
        for(int i=0; i<10; i++){
            A[i] = Integer.parseInt(br.readLine());
            A[i] = A[i] % 42;
        }

        //2. list에 A값이 중복된 값이 아닐 시에 저장 - 방법1 ArrayList
        List<Integer> list = new ArrayList<Integer>(); //list 생성
        
        for(int a : A){
            
            // a라는 값이 list에 없을 때 list에 a값 추가  
            if(!list.contains(a)){
                list.add(a);
            }
        }

        // 3. list에 저장되어 있는 값의 개수 출력
        System.out.println(list.size());
    }
}
