package ch09;

public class MemberUse {
    public static void main(String[] args) {
        Member me = new Member("홍길동","hong",120000);

        System.out.println("---------------------------");
        System.out.println("이름\t아이디\t구매금액\t등급");
        System.out.println("---------------------------");
        me.show();
    }
}
