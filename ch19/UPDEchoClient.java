package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UPDEchoClient {
    private String str;
    private BufferedReader file;
    private static int SERVERPORT = 3000;


    public UPDEchoClient (String ip, int port){
        try{
            InetAddress ia = InetAddress.getByName(ip);
            DatagramSocket ds = new DatagramSocket(port);
            System.out.println("서버측에서 보내는 메세지 : ");
            file = new BufferedReader(new InputStreamReader(System.in));
            str = file.readLine();

            byte buffer[] = str.getBytes();//스트링을 바이트 배열로 벼환
            //(UDP통신은 바이트배열로 전송해야함
            //new String(바이트배열) : 바이트배열 => 스트링
            DatagramPacket dp =
                    new DatagramPacket(buffer, buffer.length, ia
                    , SERVERPORT);
            ds.send(dp);//소켓ds을 사용해서 패킷dp을 서버에 전송
            buffer = new byte[512];
            dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp);//서버에서 보낸거 수신
            ds.close();
            System.out.println("server ip : " + dp.getAddress() + ",server port :" + dp.getPort());
            System.out.println("서버에서 보낸 메세지 : "+new String(dp.getData()).trim());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UPDEchoClient("localhost",2000);
    }
}
