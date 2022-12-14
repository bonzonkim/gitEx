package ch08;

public class PersonUse {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.showInfo();

        Person pr1 = new Person("choo");
        pr1.showInfo();

        Person pr2 = new Person("Kang",187);
        pr2.showInfo();

        Person pr3 = new Person("Kim",180,72);
        pr3.showInfo();
    }
}
