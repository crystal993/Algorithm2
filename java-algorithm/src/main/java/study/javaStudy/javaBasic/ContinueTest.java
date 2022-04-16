package study.javaStudy.javaBasic;

public class ContinueTest {
    public static void main(String[] args) {
        // 1부터 100까지 숫자 중에서 3의 배수를 출력하세요.
        int num;
        for (num = 1; num <= 100; num++) {

            // 3의 배수가 아닐 때 continue
            if((num%3)!=0) continue; // 밑의 로직은 무시하고 다시 for문 제어문으로 돌아옴.
            System.out.println(num);// 3의 배수만 찍힌다.
        }
    }
}
