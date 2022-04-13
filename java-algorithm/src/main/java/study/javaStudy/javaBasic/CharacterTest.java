package study.javaStudy.javaBasic;

public class CharacterTest {
    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); //int로 타입캐스팅

        char ch2 = 66;
        System.out.println(ch2); //B
        System.out.println((char)ch2); //B
        System.out.println((int)ch2); //66

        int ch3 = 67;
        System.out.println(ch3); //67
        System.out.println((char)ch3); //C

        char han = '한';
        char ch = '\uD55C'; //유니코드로 한을 나타냄을 알 수 있다.
        System.out.println("han = " + han);
        System.out.println("ch = " + ch);
    }
}
