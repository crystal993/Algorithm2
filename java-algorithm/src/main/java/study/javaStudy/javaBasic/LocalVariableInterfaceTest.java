package study.javaStudy.javaBasic;

public class LocalVariableInterfaceTest {
    public static void main(String[] args) {
        var i = 10;	//타입 int
        var j = 10.0;	//타입 double
        var str = "hello"; //타입 String

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        str = "test";		//str = 3;
    }
}
