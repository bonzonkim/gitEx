package ch06;

public class VariantParam2 {

    static void print(String ...n){
        for (int i=0; i<n.length; i++){
            System.out.println("과목 : "+n[i]);
        }
        System.out.println("---------------");
    }

    static void print(int ...n){
        int total = 0;
        for (int i=0; i<n.length; i++){
            System.out.println("점수 : "+n[i]);
            total += n[i];
        }
        System.out.println("총점 : "+total);
        System.out.println("평균 : "+String.format("%.1f",
                (double)total/n.length));
    }




    public static void main(String[] args) {
        System.out.println("===상반기 과목===");
        print("Java","DB");
        print(99,86);
        System.out.println();
        System.out.println("===하반기 과목===");
        print("HTML", "JSP", "Spring");
        print(95,86,75);
    }
}
