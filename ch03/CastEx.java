package ch03;

public class CastEx {
    public static void main(String[] args) {
        float f = 1.6f;
        System.out.println(f);

        f = (int)100;
        System.out.println(f);

        f = 100.5f;
        int i = (int) f; //float가 더 크기 때문에 int로 강제 형변환
        System.out.println(i);
    }
}
