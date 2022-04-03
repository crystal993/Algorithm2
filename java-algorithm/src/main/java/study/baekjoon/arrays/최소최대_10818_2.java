package study.arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

@SpringBootApplication
public class 최소최대_10818_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 1. 배열 선언
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 2. 배열에 데이터 저장
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 최댓값, 최솟값 구하기
        int max = -1000000;
        int min = 1000000;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min+" "+max);

    }
}
