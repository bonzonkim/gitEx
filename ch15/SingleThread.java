package ch15;
//Single Thread - 작업단위가 1개 ( main 스레드만 존재)
public class SingleThread {
    void print(){
        //name of current thread
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) { //main메소드도 스레드다.
        SingleThread st = new SingleThread();
        st.print();
        st.print();
    }
}
