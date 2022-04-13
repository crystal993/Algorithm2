package study.CodingTestBasic.String;

public class Replace {
    public static void main(String[] args) {
        // replace 와 replaceAll의 차이
        // 사용용도
        // replace(찾을문자열, 바꿀문자열)
        // replaceAll(정규식 또는 기존문자, 대체문자)

        // 1. replace(찾을 문자열, 바꿀 문자열)
        // .(점)을 문자로 인식하여 점을 ^^으로 치환
        String str = "안녕하세요. 반가워요. 또 놀러오세요.";
        str = str.replace(".","^^");
        System.out.println("str = " + str);
        

        // 2. replaceAll(정규식, 대체문자)
        // .(점)을 정규식으로 인식하여 .은 모든 문자를 의미 
        // 모든 문자를 ^^으로 치환
        String str2 = "안녕하세요. 반가워요. 또 놀러오세요.";
        str2 = str2.replaceAll(".","^^");
        System.out.println("str2 = " + str2);
    }
}
