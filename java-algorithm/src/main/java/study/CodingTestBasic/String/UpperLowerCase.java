package study.CodingTestBasic.String;

public class UpperLowerCase {
    public static void main(String[] args) {

        // 대문자 -> 소문자
        String str = "ABC";
        str = str.toLowerCase();
        System.out.println(str);

        // 소문자 -> 대문자
        String str2 = "abc";
        str2 = str2.toUpperCase();
        System.out.println(str2);
    }
}
