package ch09;

public class Sale extends Product{
    private int price;
    private int quantity;
    private int salesIncome;

    public void Input(int code, String name, String company,String date,
                      int price, int quantity) {
        setCode(code);
        setName(name);
        setCompany(company);
        setDate(date);
        this.price = price;
        this.quantity = quantity;
    }
    public void calculate(){
        salesIncome = price*quantity;
    }
    public void print(){
        System.out.println("코드\t제품명\t제조자\t제조일\t가격\t수량\t금액");
        System.out.println(getCode()+"\t"+getName()+"\t"+getCompany()
                +"\t"+getDate()+"\t"+price+"\t"+quantity+"\t"+
                salesIncome);
    }
}
