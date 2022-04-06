package study.CodingTestBasic.String;

public class Reverse {
    public static void main(String[] args) {
        // String 문자열을 뒤집기 할 때,
        // StringBuilder(문자열).reverse().toString() 메소드를 사용한다.
        String str = "Reverse";
        str = new StringBuilder(str).reverse().toString();
        System.out.println("str = " + str);
    }
}
