package study.javaStudy.oop.ch21;

public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");

        // 객체 배열 복사
        // 1. 얕은 복사 : 객체의 주소값이 복사된다.
        System.arraycopy(library,0, copyLibrary, 0, 5);

        System.out.println("===library===");
        for (Book book: library) {
            System.out.println(book); // 객체를 참조할 주소값이 출력
            book.showInfo();
        }

        // 주소값이 위의 객체들과 같음을 볼 수 있다.
        System.out.println("\n===copyLibrary===");
        for (Book book: copyLibrary) {
            System.out.println(book); // 객체를 참조할 주소값이 출력
            book.showInfo();
        }

        // 복사한 객체 배열의 값 변경
        copyLibrary[0].setAuthor("박완서");
        copyLibrary[0].setTitle("나목");

        // 원래 library
        System.out.println("\n===library===");
        System.out.println(library[0]); //coptlibrary[0]와 주소값이 같다.
        library[0].showInfo(); // library도 값이 바뀐 것을 볼 수 있다.

        // 복사한 copyLibrary
        System.out.println("\n===copyLibrary===");
        System.out.println(copyLibrary[0]); //library[0]와 주소값이 같다.
        copyLibrary[0].showInfo();
    }
}
