package study.CodingTestBasic.String;

public class LastIndexOf {
    public static void main(String[] args) {
        // str.lastIndexOf("찾을 특정 문자", "시작할 위치")
        // lastIndexOf()는 특정 문자나 문자열이
        // 뒤에서부터 처음 발견되는 인덱스를 반환하며
        // 만약 찾지 못했을 경우 -1을 반환한다.

        String str = "hello world!";

        System.out.println(str.lastIndexOf('o')); //7
        System.out.println(str.lastIndexOf('o',str.length()-1)); //7
        System.out.println(str.lastIndexOf('o',6)); //4
    }
}
