package ch14;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String publisher;
    private int price;
    private int amount;
    private int  money; //price*amount

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("도서명 : ");
        bookName = sc.next();
        System.out.print("출판사 : ");
        publisher = sc.next();
        System.out.print("단가 : ");
        price = sc.nextInt();
        System.out.print("수량 : ");
        amount = sc.nextInt();

        money = price*amount;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
    public int getMoney(){
        return money;
    }

}
