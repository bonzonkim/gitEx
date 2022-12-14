package ch12;


class outerP{
    int num = 1;
    String name = "홍길동";
    String email = "hong@gmail.com";
    void showInfo(){
        class InnerP{
        }
        InnerP in = new InnerP();
        System.out.println("고객번호 : "+num+"\n"+"이름 : "+name+"\n"+
                "이메일 : "+email);
    }
}





public class MemberOuter {
    public static void main(String[] args) {
        outerP o = new outerP();
        o.showInfo();
    }
}


