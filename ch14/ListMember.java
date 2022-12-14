package ch14;

import java.util.ArrayList;

public class ListMember {
    public static void main(String[] args) {
        ArrayList<Member> list = new ArrayList<>();

        //1) Member 인스턴스 생성 후 setter
        Member m1 = new Member();
        m1.setName("Eddie");
        m1.setUserId("edk");
        m1.setPassword("1234");
        m1.setTel("010200120");
        m1.setEmail("agldsj");
        //ArrayList에 Member인스턴스를 추가

        list.add(m1);
        System.out.println(list.size());


        //2)생성자 활용
        Member m2 = new Member("hong", "1234", "홍길동", "02-222-2222", "hong@gmail.com");
        list.add(m2);
        System.out.println(list.size());

        //3) 참조변수 재사용 안하고 한번만 사용할거라면
        list.add(new Member("bon", "1234", "kim", "02-111-1111", "choi@gmail.com"));
        System.out.println(list.size());

        System.out.println("이름\t아이디\t비밀번호\t전화\t이메일");
        for (int i = 0; i < list.size(); i++) {
            Member m = list.get(i); //m == 각데이터를 가리킬 임시 참조변수
            System.out.println(m.getName()+"\t"+m.getUserId()+"\t"+m.getPassword()+"\t"+m.getTel()+"\t"+m.getTel());
        }
    }
}
