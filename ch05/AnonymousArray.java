package ch05;
//익명배열 : 배열의 이름을 지정하지 않고 단순히 초기값만으로 해결
//익명배열은 즉시 배열을 만들어 함수의 인자로 전달할 때 쓰이며 배열이 딱 한번만 필요할때 사용
public class AnonymousArray {
    /*public static void main(String[] args) {
        System.out.println("숫자들의 합 : " + sum(new int[]{1, 2, 3, 4}));
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }*/
    public static void main(String[] args){
        System.out.println("숫자들의 합 :" + sum(new int[]{1, 2, 3, 4}));
    }
    public static int sum(int[] numbers){
        int total =0;
        for (int i=0; i<numbers.length; i++){
            total += numbers[i];
        }
        return total;

    }

    }
