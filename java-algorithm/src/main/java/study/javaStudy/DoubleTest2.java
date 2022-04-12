package study.javaStudy;

public class DoubleTest2 {
    public static void main(String[] args) {
        //부동소수점의 오류

        double dnum = 1;

        for (int i = 0; i < 10000; i++) {
            dnum = dnum + 0.1;
        }

        System.out.println(dnum);
        // 1001이 아닌
        // 1001.000000000159  이 출력되는 것을 볼 수 있다.

    }
}
