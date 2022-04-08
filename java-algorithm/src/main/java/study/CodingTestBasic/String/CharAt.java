package study.CodingTestBasic.String;

public class CharAt {
    public static void main(String[] args) {
        // 문자열변수명.charAt()
        // String으로 저장된 문자열 중에서 한 글자만 선택해서 해당위치에 있는 문자만을 char타입으로 변환
        // charAt()으로 인해 Scanner를 쓰면서도 char타입을 사용할 수 있다.
        String str = "kimSuJeong";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
