package ch05;

public class Array2_다차원배열 {
    public static void main(String[] args) {
        //3행3열 == int[][] num = new int[3][3];
        int[][] num = {{10,20,30},{40,50,60},{70,80,90}};

        for (int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length; j++){
                System.out.print(num[i][j]+"\t");
            }
        }
    }
}
