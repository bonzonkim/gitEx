package ch13;

//인스턴스 복제하려면 Cloneable을 implements해야됨
public class Clone implements Cloneable{
    int num = 10;
    void print(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        Clone t1 = new Clone();
        Clone t2 = null;
        try{
            t2 = (Clone)t1.clone(); //인스턴스 복제
            //object의 메소드라서 Clone으로 형변환 해야함
        }catch (CloneNotSupportedException e){
                e.printStackTrace();//debugging 정보 제공 메소드
        }
        System.out.println(t1);
        System.out.println(t2);
        t1.print();
        t2.print();
    }
}
