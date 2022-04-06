package study.CodingTestBasic.String;

public class Substring {
    public static void main(String[] args) {
        //String 문자열 일부를 추출할 때 스트링명.substring() 메소드를 사용한다.
        //스트링명.substring(idx) : idx를 포함한 위치부터 문자열 끝까지 추출한다.
        //스트링명.substring(시작값, 끝 값) : (시작값)부터 (끝 값-1)까지의 문자열을 추출한다.
        
        String str = "1234567";

        str.substring(3); //시작값
        System.out.println("str = " + str);

        str.substring(2,5); //시작값, 끝값-1
        System.out.println("str = " + str);
    }
}
