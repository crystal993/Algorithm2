package study.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(nums[i]);
        }
        System.out.println(sum);
    }
}
