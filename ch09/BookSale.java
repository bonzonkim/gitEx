package ch09;

public class BookSale extends Book{
    private int quantity;
    private int rank;
    private int salesIncome;//판매금액 (단가*수량) 금액 10만원 초과시 10%할인

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setSalesIncome(){
        salesIncome = getPrice()*quantity;
        if (salesIncome > 100000){
            salesIncome = (int)(salesIncome*0.9);
        }
    }
    public void print(){
        System.out.println("도서명\t출판사\t저자\t출판연도\t단가\t판매수량\t금액\t순위");
        System.out.println(getBookName()+"\t"+getPublisher()+"\t"+getAuthor()
                +"\t"+getYear()+"\t"+getPrice()+"\t"+quantity+"\t"+salesIncome
                +"\t"+rank);
    }
}
