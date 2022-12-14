package ch07;

public class BookStoreUse {
    public static void main(String[] args) {
        BookStore book = new BookStore();//객체생성과 동시에 기본생성자 호출, 생성자는 메소드
        book.setBookname("김학현의 이모저모");
        book.setAuthor("김학현");
        book.setPublisher("나무");
        book.setYear(1998);
        book.setPrice(300);
        book.setAmount(10);
        book.print();
    }
}
