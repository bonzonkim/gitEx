package ch07;

public class PersonUse2 {
    public static void main(String[] args) {
        Person2 pr = new Person2();
        Person2 pr2 = new Person2();

        pr.setName("홍길동");
        pr.setAge(30);
        pr.setEmail("hong@gmail.com");
        pr.setAdrs("서울시 강남구 역삼동");

        pr2.setName("사임당");
        pr2.setAge(25);
        pr2.setEmail("saimdang@gmail.com");
        pr2.setAdrs("서울시 강남구 서초동");

        pr.print();
        System.out.println();
        pr2.print();
    }
}
