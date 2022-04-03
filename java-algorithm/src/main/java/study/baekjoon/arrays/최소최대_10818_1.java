package study.arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.io.*;

@SpringBootApplication
public class 최소최대_10818_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);

    }
}
