package ch05;

public class ArrayIf {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 80, 100};
        if (arr != null){ //배열은 데이터가 아닌 데이터가 있는 메모리의 주소값을 기억
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
