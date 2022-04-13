package study.CodingTestBasic.String;

public class EqualsIgnoreCase {
    public static void main(String[] args) {

        // 1. str1.equalsIgnoreCase(str2)
        // 대소문자를 구분하지 않는다.
        // 같으면 true, 아니면 false

        String str1 = "Apple";
        String str2 = "apple";

        System.out.println("====== equalsIgnoreCase start =========");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("str1, str2는 같다. "); //출력
        } else {
            System.out.println("str1, str2는 다르다. ");
        }

        // 2. str1.equals(str2)
        // 대소문자를 구분한다.
        // 같으면 true, 아니면 false

        System.out.println("====== equals start =========");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        if(str1.equals(str2)){
            System.out.println("str1, str2는 같다. ");
        } else {
            System.out.println("str1, str2는 다르다. "); //출력
        }
    }
}
