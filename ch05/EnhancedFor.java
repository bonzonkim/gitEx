package ch05;

public class EnhancedFor {
    //enum 은 배열보다 간편한 방식, enumerate 열거하다
    enum Week {월,화,수,목,금,토,일} //Week는 사용자 지정 객체이름

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        String[] names = {"사과","배","바나나","체리","딸기","포도"};
        int sum = 0;

        for (int asdf : n){
            System.out.print(asdf);
            sum+=asdf;
        }
        System.out.println("합은 : "+sum);

        for (String asdf : names){
            System.out.println(asdf);
        }
        System.out.println();
        for (Week day : Week.values()){ //객체이름.values 객체의 값을 반환
            System.out.print(day + "요일  ");
        }


    }
}
