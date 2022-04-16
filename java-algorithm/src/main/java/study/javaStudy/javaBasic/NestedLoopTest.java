package study.javaStudy.javaBasic;

public class NestedLoopTest {
    public static void main(String[] args) {
        int dan = 2;
        int cnt = 1;

        for (; dan < 10; dan++) {
            for (cnt = 1;  cnt<10 ; cnt++) {
                System.out.print(dan+"X"+cnt+"="+dan*cnt);
            }
            System.out.println("");
        }

        dan = 2;
        cnt = 1;
        while (dan<=9){
            while (cnt<=9){
                System.out.println(dan+"X"+cnt+"="+dan*cnt);
                cnt++;
            }
            dan++;
            cnt=1;
        }
    }
}
