package study.arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.io.*;

@SpringBootApplication
public class 최댓값_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0;
        int arr[] = new int[9];
        int max = -1000000;

        for(int i=0; i<9; i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i] > max){
                max = arr[i];
                idx=i+1;
            }
        }

        System.out.println(max+"\n"+idx);

    }
}

