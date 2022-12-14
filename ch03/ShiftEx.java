package ch03;

public class ShiftEx {
    public static void main(String[] args) {
        int a = 2; //이진수 0010
        int b = a << 2; //이진수 1000 비트를 왼쪽으로 2칸씩 옮김
        System.out.println(b);
        b = b >> 2;//1000 =>0010 다시 오른쪽으로 2칸 옮김
        System.out.println(b);

    }
}
