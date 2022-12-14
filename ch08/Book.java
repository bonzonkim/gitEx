package ch08;

public class Book {
    private String bookName;
    private String author;
    private String press;
    private int year;
    private int price;
    private int quantitiy;
    private int money;

    public Book() {
        this("Java","Kim","hanbit",1998,50000,20);
        System.out.println("call default constructor");
    }

    public Book(String bookName, String author, String press, int year, int price, int quantitiy) {
        this.bookName = bookName;
        this.author = author;
        this.press = press;
        this.year = year;
        this.price = price;
        this.quantitiy = quantitiy;
        money = price * quantitiy;
    }

    public void print(){
        System.out.println("book\tauthor\tpublisher\tdate\tprice\tquantity\tmoney");
        System.out.println(bookName+"\t"+author+"\t"+"\t"+press+"\t"+"\t"+year+"\t"+price+"\t"+quantitiy+"\t"+"\t"+"\t"+money);
    }


}
