package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
    public static double valueOfSupply; //공급가액
    public static int vatRate = 10; //부가세율
    public static double getVat(){ //부가세계산
        return valueOfSupply / vatRate;
    }
    public static double getTotal(){ //부가세포함합계
        return valueOfSupply + getVat();
    }

    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("###,###");
        Scanner sc = new Scanner(System.in);
        System.out.print("공급가액 입력 : ");
        ValueAddedTax.valueOfSupply = Integer.parseInt(sc.nextLine());
        System.out.println("============================================");
        System.out.println("공급가액 :" + dec.format((int) valueOfSupply) + "원");
        System.out.println("부가가치세율 : " + (int)vatRate + "%");

            System.out.println("부가가치세 : " + dec.format(getVat()) + "원");
        System.out.println("합계 : "+dec.format((int)getTotal())+"원");
    }
}

