package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//TCP방식 - 연결성 (서버와 클라이언트가 연결된 상태에서 데이터 송수신)
//UDP방식 - 비연결성 (단방향 전송)
public class UDPEchoServer {
    public UDPEchoServer(int port){
        try{
            DatagramSocket ds = new DatagramSocket(port);
            while (true) {
                //UDP방식은 데이터를 바이트배열로 전송함.바이트배열 최대크기 65508
                //String을 바로보낼 수 없음.
                byte buffer[] = new byte[512];
                //udp방식의 통신은 데이터를 패킷(데이터 조각)으로 만들어보냄
                DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
                System.out.println("ready");

                //클라이언트가 보낸 메세지를 수신
                //소켓을 통해 수신된 클라이언트의 메세지를 DatagramPacket저장
                ds.receive(dp);
                //클라이언트에서 보낸 메시지(바이트배열)을 스트림으로 변환
                //new String(바이트배열 ==> 문자열로 변환
                String str = new String(dp.getData());

                InetAddress ia = dp.getAddress();//클라이언트측 ip주소 get
                port = dp.getPort(); //포트번호 get'
                System.out.println("client ip :"+ia+" , client port :"+port);
                //클라이언트에게 전송할 패킷객체 생성
                //(바이트배열,바이트배열크기,ip주소,포트번호)
                dp = new DatagramPacket(dp.getData(),dp.getData().length,ia,port);
                ds.send(dp);
                ds.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        new UDPEchoServer(3000);
    }
}
