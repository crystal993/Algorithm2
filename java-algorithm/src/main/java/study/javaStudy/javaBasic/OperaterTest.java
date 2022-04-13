package study.javaStudy.javaBasic;

public class OperaterTest {
    public static void main(String[] args) {

        int gameScore = 150;
        int lastScore = ++gameScore; //;가 끝나기 전에 이미 1이 증가되어있음
        System.out.println("lastScore = " + lastScore);
        System.out.println("gameScore = " + gameScore);

        lastScore = gameScore++; //;가 끝난 다음에 1이 증가된다.
        // lastScore += gameScore;
        System.out.println("lastScore = " + lastScore);
        System.out.println("gameScore = " + gameScore);

    }
}
