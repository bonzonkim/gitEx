package ch06;

public class VariantParam {

//    static  void print(String a){
//        System.out.println(a);
//    }
//    static  void print(String b1,String b2){
//        System.out.println(b1);
//        System.out.println(b2);
//    }
//    static  void print(String c1, String c2, String c3){
//
//    }
//    static  void print(String d1,String d2,String d3,String d4,String d5){
//
//    }

    static void print(String...n){//n이 가변형 매개변수
        for (int i=0; i<n.length; i++){
            System.out.println(n[i]);
        } System.out.println("=========");
    }



    public static void main(String[] args) {
        print("Java");
        print("Java","program");
        print("Java","program","jsp");
        print("Java","program","jsp","big","data");
    }
}
