package study.Inflearn.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점수계산_p7 { //8분
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int num = 0, cnt=0, sum =0;

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(str[i]);
            if(num==1) cnt++; //1이면 1씩증가
            else cnt = 0; //0이면 0
            sum += cnt; //증가된 수만큼 더함
        }
        System.out.println(sum);
    }
}
