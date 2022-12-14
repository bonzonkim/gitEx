package practice;

public class 약수구하기 {
//    class Solution {
//        public int[] solution() {
//            int[] answer = {};
//            for(int i = 1; i<=24; i++){
//                if(24%i==0){
//                    answer[i] += i;
//                }
//            }
//
//            return answer;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] rkd = {};
//        for (int i = 1; i<24; i++){
//            if (24%i==0){
//                rkd[i] = i;
//            }
//        }
//        for (int i=0; i<rkd.length; i++){
//            System.out.println(rkd[i]);
//        }
//    }
public static void main(String[] args) {


    for (int i = 1; i <= 20; i++) {
        switch (i % 5) {
            case 0:
                System.out.println(i + ": 5의 배수입니다");
                break;
            default:
                System.out.println(i + ": 5의 배수가 아닙니다");
        }

    }

}

}
