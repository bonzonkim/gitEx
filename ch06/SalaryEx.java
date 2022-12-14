package ch06;

public class SalaryEx {
    static String[] name = {"박과장","김과장","이대리","최주임","홍실장"};
    static int[] salary = {2000,3000,2500,2000,3500};
    static int[] bonus = {0,0,0,0,0};
    static int[] total = new int[5]; //total
    static int[] tax = new int[5]; //tax
    static int[] pay = new int[5]; //income
    static int payTot;

    static void calc(){
        for (int i=0; i<name.length; i++){
            bonus[i] = (int)(salary[i]*0.3); //30% in total
            total[i] = salary[i]+bonus[i];
            tax[i] = (int)(total[i]*0.03); //3% in total
            pay[i] = total[i]-tax[i]; //income
            payTot += pay[i];
        }
    }
    static void print(){
        System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]
                    +"\t"+total[i]+"\t"+tax[i]+"\t"+pay[i]);
        }
        System.out.println("총지급액(실수령)합계 : "+payTot);
        System.out.println("총지급액 평균 : "+payTot/name.length);
    }

    public static void main(String[] args) {
        calc();
        print();
    }
}
