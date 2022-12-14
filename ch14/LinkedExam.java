package ch14;

import java.util.LinkedList;

public class LinkedExam {
    public static void main(String[] args) {
        //que - FIFO First In First Out
        String[] fruits = {"사과", "배", "포도", "딸기", "수박"};
        LinkedList<String> list = new LinkedList<>();
        for (String str : fruits) {
            list.offer(str); // offer = add = push
        }
        String str = "";
        while((str=(String)list.poll())!=null){
            System.out.println(str+ " removed");
        }
    }
}
