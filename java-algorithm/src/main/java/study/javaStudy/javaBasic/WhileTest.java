package study.javaStudy.javaBasic;

public class WhileTest {
    public static void main(String[] args) {
        // 10까지의 합
        int num = 1;
        int sum = 0;
        while(num <= 10){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
