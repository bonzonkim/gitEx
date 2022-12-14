package ch05;

public class ArrayPoint {
    public static void main(String[] args) {
        String[] name = {"홍길동","이몽룡","성춘향","강감찬","이순신"};
        int[] kor = {100, 80, 56, 45, 78};
        int[] eng = {85,49,23,68,99};
        int[] math = {55,61,70,42,78};
        int[] total ={0,0,0,0,0};
        double[] avg = new double[5];
        double tot_avg = 0;

        for (int i =0; i<5; i++){
            total[i] = kor[i]+eng[i]+math[i];
            avg[i] = total[i]/3.0;
            //tot_avg += avg[i];
            tot_avg = tot_avg+avg[i]/name.length;
        }
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        for (int i =0; i<5; i++){
            System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]
                    +"\t"+total[i]+String.format("%8.1f",avg[i]));
        }
        System.out.println("학급 평균 : "+String.format("%4.1f",tot_avg));
    }
}
