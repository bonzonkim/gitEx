package ch19;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket ss = new ServerSocket(8000)){
            System.out.println("서비스 시작");
            while (true) {
                //클라이언트에서 접속하면 소켓연결
                Socket socket = ss.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
                String str = sdf.format(new Date());
                out.println(true);
                socket.close();
            }
        }
    }

}
