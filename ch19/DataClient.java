package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 8000);
        //서버에서 accept()하면 통신이 가능한 상태가됨
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //서버에서 보낸 메시지를 받음
        String str = input.readLine();
        System.out.println(str);
        s.close();
        System.exit(0);//프로그램 종료
    }
}
