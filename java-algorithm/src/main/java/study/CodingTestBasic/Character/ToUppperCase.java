package study.CodingTestBasic.Character;

public class ToUppperCase {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'b';

        ch1 = Character.toUpperCase(ch1);
        ch2 = Character.toUpperCase(ch2);

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);


    }
}
