package study.arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class CountOfNumber_2577 {
    public static void main(String[] args) throws IOException {
        // 숫자의갯수_2577
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 세 수를 곱해준다.
        int value=1; //0이면 곱할 때마다 0이 나옴.
        for(int i=0; i<3; i++){
            value*=Integer.parseInt(br.readLine());
        }

        //2. arr 배열에 자릿수를 저장
        String str = Integer.toString(value);
        char[] arr = str.toCharArray(); //toCharArray() 문자열 중에 문자 하나하나를 담도록 변환시키는 함수

        //3. cnt 배열에 정답값에 0부터9까지 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력
        int[] cnt = new int[10];
        for(int c_idx=0; c_idx<cnt.length; c_idx++){
            for(int j=0; j<arr.length; j++){
                if(c_idx==Integer.parseInt(String.valueOf(arr[j]))){
                    cnt[c_idx]++;
                }
            }
        }

        //4.cnt출력
        for (int i=0; i<cnt.length; i++){
            System.out.println(cnt[i]);
        }
    }
}
