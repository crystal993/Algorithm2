package study.javaStudy.oop.ch21;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");

        // 객체 배열 복사
        // 2. 깊은 복사 : 각각의 객체를 새로 생성한다.
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        // 2. 깊은 복사 : 각각의 객체가 독립적인 주소값을 갖는다.
        for (int i = 0; i < copyLibrary.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        System.out.println("===library===");
        for (Book book: library) {
            System.out.println(book); // 객체를 참조할 주소값이 출력
            book.showInfo();
        }

        // 주소값이 위의 객체들과 다름을 볼 수 있다.
        System.out.println("\n===copyLibrary===");
        for (Book book: copyLibrary) {
            System.out.println(book); // 객체를 참조할 주소값이 출력
            book.showInfo();
        }
        
    }
}
