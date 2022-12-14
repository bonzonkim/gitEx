package practice;

public class 별찍기7 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=0; j<5-i; j++){
                System.out.print(" ");
            }for (int k=0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }//윗 파트 for문 끝
        for (int i=5; i>0; i--){
            for (int j=5; j>i-1; j--){
                System.out.print(" ");
            }for (int k=0; k<i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }//아래파트 for문 끝
    }
}
