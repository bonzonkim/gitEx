package ch06;

public class StudentPoint {
    static String[] name = {"홍길동", "사임당", "이순신"};
    static int[] java = {90, 95, 84};
    static int[] db = {85, 79, 92};
    static int[] html = {99,88,95};
    static int[] jsp = {76,92,72};
    static int[] total = {0, 0, 0};
    static double[] avg = {0, 0, 0};


    public static void getTotal(){
        for (int i=0; i<name.length; i++){
            total[i] = java[i]+db[i]+html[i]+jsp[i];
        }
    }
    public static void getAvg(){
        for (int i=0; i<name.length; i++){
            avg[i] = (double) total[i] / name.length;
        }
    }
    public static void print(){
        System.out.println("----------------------------------------");
        System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
        System.out.println("----------------------------------------");
        for (int i=0; i< name.length; i++){
            System.out.println((i+1001)+"\t"+ name[i]+"\t"+java[i]+"\t"+
                    db[i]+"\t"+html[i]+"\t"+jsp[i]+"\t"+total[i]+"\t"+
                    String.format("%.1f",avg[i]));
        }
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
       getTotal();
       getAvg();
       print();
    }

}
