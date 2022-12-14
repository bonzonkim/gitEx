package ch06;

public class PointEx {

    static String[] name = {"홍길동","이몽룡","이순신","차두리","박지성"};
    static int[] kor = {80,90,100,60,70};
    static int[] eng = {90,99,77,66,88};
    static int[] math = {89,60,80,90,100};
    static int[] total = {0,0,0,0,0};
    static double[] avg = {0.0,0.0,0.0,0.0,0.0};

    static void getTot(){
        for (int i=0; i<5; i++){
            total[i] = kor[i]+eng[i]+math[i];
        }
    }
    static void getAvg(){
        for (int i=0; i<5; i++){
            avg[i] = total[i]/3.0;
        }
    }
    static void print(){
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]
                    +"\t"+math[i]+"\t"+total[i]+"\t"+String.format("%.1f",avg[i]));
        }
    }

    public static void main(String[] args) {
        getTot();
        getAvg();
        print();
    }
}
