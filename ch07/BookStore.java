package ch07;

public class BookStore {
    private String bookname;
    private String author;
    private String publisher;
    private int year;
    private int price;
    private int amount;
    private int money;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMoney() {
        money = price * amount;
        return money;
    }
    public void print(){
        System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
        System.out.println(bookname+"\t"+author+"\t"+publisher+"\t"+year+"\t"+price+"\t"+amount+"\t"+
                getMoney());
    }


}
