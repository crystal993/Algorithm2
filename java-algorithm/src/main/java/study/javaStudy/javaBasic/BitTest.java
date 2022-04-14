package study.javaStudy.javaBasic;

public class BitTest {

    public static void main(String[] args) {
        // 비트연산자
        
        int num1 = 5;  	// 00000101
        int num2 = 10; 	// 00001010

        // 1. |
        // 비트 1 | 0 이면 결과가 1, 이 외에는 0
        System.out.println(num1 | num2); // 00001111 => 15

        // 2. &
        // 비트 1 & 1 이면 결과가 1, 이 외에는 0
        System.out.println(num1 & num2); // 00000000 => 0

        // 3. ^
        // 두 개의 비트가 다른 경우에 1
        System.out.println(num1 ^ num2); // 00001111 => 15

        // 4. ~ (not)
        // 비트의 반전(1의 보수)
        // 원래 num1 = 00000101
        System.out.println(~num1); // 1111110 => -6

        // 5. << (왼쪽 쉬프트)
        // 비트 왼쪽으로 밀기
        // 원래 num1 = 00000101
        System.out.println(num1 << 2); // 00010100 => 20
        // num1 << 2 : 2번 왼쪽으로 밀기
        
        // num1의 값이 원래 값 그대로임을 확인할 수 있다.
        System.out.println(num1); //5

        // 7. <<= (왼쪽쉬프트 + 대입연산자)
        // 비트 왼쪽으로 밀기, 왼쪽으로 민 값을 num1에 저장
        // 원래 num1 = 00000101
        System.out.println(num1 <<= 2); // 00010100 => 20
        // num1 <<= 2 : 2번 왼쪽을 민 다음에 그 값을 num1에 저장

        // num1의 값이 20으로 바뀐 것을 볼 수 있다. 
        System.out.println(num1); //20

    }
}

