package study.javaStudy.javaBasic;

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
        // 부동소수점 방식이 약간의 오차가 있다는 것을 알 수 있다.
    }
}
