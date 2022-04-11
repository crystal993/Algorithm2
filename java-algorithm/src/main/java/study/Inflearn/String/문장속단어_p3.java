package study.Inflearn.String;

import java.util.Scanner;

public class 문장속단어_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 공백을 기준으로 하는 문자열 배열을 만든다.
        String str[] = sc.nextLine().split(" ");
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }

        //2. 각 문자열 배열 요소를 char배열로만들어서 길이 비교한 후
        // 가장 긴 길이를 가진 문자열 배열 인덱스를 저장
        char[] ch;
        int max=0; // 최대길이 담을 변수 
        int max_idx=0; //최대 길이 갖고 있는 인덱스 담는 변수
        for (int i = 0; i < str.length; i++) {
            ch = str[i].toCharArray();
            if(max < ch.length){ // <= 하면 안된다. 뒤에 것이 갱신이 된다.
                max = ch.length;
                max_idx = i;
            }
        }

        System.out.println(str[max_idx]);
    }
}
