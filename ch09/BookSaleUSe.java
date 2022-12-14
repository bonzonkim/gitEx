package ch09;

public class BookSaleUSe {
    public static void main(String[] args) {
        BookSale bb = new BookSale();
        bb.setBookName("트럭에 부딪혀 이세계로 전생하니 권순영인 건에 대하여");
        bb.setPrice(30000);
        bb.setAuthor("강범구");
        bb.setQuantity(40);
        bb.setPublisher("책과나무");
        bb.setRank(1);
        bb.setSalesIncome();
        bb.print();
    }
}
