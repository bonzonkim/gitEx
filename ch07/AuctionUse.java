package ch07;

public class AuctionUse {
    public static void main(String[] args) {
        Auction ac = new Auction();

        ac.setName("홍길동");
        ac.setId("hong");
        ac.setPurchase(150000);
        ac.getGrade();
        ac.print();
    }
}
