package nested.test.ex1;

public class Library {
    private Book[] library;
    private int count;

    public Library(int i) {
        this.library = new Book[i];
        count = 0;
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        if (count < library.length) {
            library[count] = book;
            count++;
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + library[i].title +", 저자: " + library[i].author);
        }
    }

    private static class Book {
        String title;
        String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
