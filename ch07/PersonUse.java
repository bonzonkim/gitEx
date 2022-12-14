package ch07;

public class PersonUse {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.setName("김철수");
        pr.setAge(20);
        pr.setHeight(180.0);
        System.out.println("이름 "+pr.getName());
        System.out.println("나이 "+pr.getAge());
        System.out.println("키 "+pr.getHeight());
    }
}
