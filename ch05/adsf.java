package ch05;

public class adsf {
    public static void main(String[] args) {
        int n = 10;
        int[] answer = new int[n];
        for (int i=0; i<=n; i++){
            if (i%2!=0){
                answer[i] = i;
            }
            System.out.println(answer[i]);
        }
    }
}
