package ch07;

class Phone{
    String model;
    int value;
    void print(){
        System.out.println(value + "만원 짜리 "+model+" 스마트폰");
    }
}




public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.model = "갤럭시 22";
        myPhone.value = 100;
        myPhone.print();

        Phone yoPhone = new Phone();
        yoPhone.model = "아이폰 14";
        yoPhone.value = 120;
        yoPhone.print();
        }
        }


