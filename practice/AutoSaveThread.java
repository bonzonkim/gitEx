package practice;

public class AutoSaveThread extends Thread {

//    public void save(){
//        System.out.println("SAVED");
//    }

    @Override
    public void run() {
        while (true) {
            System.out.println("SAVED");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }
}

