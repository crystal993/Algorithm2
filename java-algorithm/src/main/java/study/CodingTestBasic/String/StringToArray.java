package study.CodingTestBasic.String;

public class StringToArray {
    public static void main(String[] args) {
        // String to Array
        // String 문자열을 Array로 만들 때, 스트링명.split() 메소드를 사용한다.
        String str = "12345";
        String[] Arr = str.split("");

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Arr["+i+"] = " + Arr[i]);
        }
    }
}
