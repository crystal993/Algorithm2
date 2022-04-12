package study.CodingTestBasic.String;

public class IndexOf {
    public static void main(String[] args) {
        // 1. str.indexOf("찾을 특정 문자", "시작할 위치")
        // IndexOf()는 특정문자나 문자열이
        // 앞에서부터 처음 발견되는 인덱스를 발견하며
        // 만약 찾지 못했을 경우 -1을 반환한다.

        String str = "hello world!";

        System.out.println(str.indexOf('o')); //4
        System.out.println(str.indexOf('o', 0)); //4
        System.out.println(str.indexOf('o',5)); //7

    }
}
