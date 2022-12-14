package ch08;

public class BookUse {
    public static void main(String[] args) {
        Book bk = new Book("Java","Hong","Young",2002,30000,15);
        bk.print();

        Book bk2 = new Book();
            bk2.print();

    }
}
