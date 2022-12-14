package ch12;

public class MemberAnony {
    public static void main(String[] args) {
        Member me = new Member() {
            @Override
            public void showInfo() {
                System.out.println("고객번호 : "+num+"\n"+"이름 : "+name+"\n"+"이메일 : "+email);
            }
        };
        me.showInfo();
    }
}
