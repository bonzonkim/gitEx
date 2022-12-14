package practice;

public class 별찍기6 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }//윗 파트 for문 끝
        for (int i=0; i<5; i++){
            for (int j=5; j<10-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }//아래 파트 for문 끝
    }
}
