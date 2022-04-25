package study.javaStudy.oop1.ch23;

// 외부 패키지의 클래스 Book을 import
import study.javaStudy.oop1.ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥1","조정래"));
        library.add(new Book("태백산맥2","조정래"));
        library.add(new Book("태백산맥3","조정래"));
        library.add(new Book("태백산맥4","조정래"));
        library.add(new Book("태백산맥5","조정래"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo(); //객체 배열 인덱스에 해당하는 정보 출력
        }
    }
}
