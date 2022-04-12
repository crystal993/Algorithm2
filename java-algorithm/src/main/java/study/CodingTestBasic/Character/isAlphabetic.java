package study.CodingTestBasic.Character;

public class isAlphabetic {
    public static void main(String[] args) {

        // Character.isAlphabetic(char형 변수)
        // char형 문자가 영어 알파벳인지 판단하여
        // 참/거짓 여부 리턴해줌 

        char c1 = 'a'; //영어 소문자
        char c2 = 'A'; //영어 대문자
        char c3 = '?'; //특수문자
        char c4 = '4'; //숫자

        // 출력
        System.out.println(Character.isAlphabetic(c1)); //true
        System.out.println(Character.isAlphabetic(c2)); //true
        System.out.println(Character.isAlphabetic(c3)); //false
        System.out.println(Character.isAlphabetic(c4)); //false
    }
}
