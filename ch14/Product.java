package ch14;

import java.util.Scanner;

public class Product {
    private String prodNum;
    private String prodName;
    private String company;
    private int price;
    private int quantity;
    private int money;


    public String getProdNum() {
        return prodNum;
    }

    public void setProdNum(String prodNum) {
        this.prodNum = prodNum;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getMoney(){
        return price * quantity;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("제품번호 : ");
        prodNum = sc.next();
        System.out.print("제품명 : ");
        prodName = sc.next();
        System.out.print("제조사 : ");
        company = sc.next();
        System.out.print("단가 : ");
        price = sc.nextInt();
        System.out.print("수량 : ");
         quantity = sc.nextInt();
    }
}
