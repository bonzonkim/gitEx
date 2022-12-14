package ch19;

import java.net.ServerSocket;

public class SocketExam {
    public static void main(String[] args) {
        //Serversocket = 서버에서 서비스를 위한 목적으로 만드는 소켓
        ServerSocket socket = null;
        //포트번호는 0-65535 에서 배정가능 중복하면안됨
        //1port 1service
        //well known port number(자주 사용하는 번호)
        //80: web service , 21: FTP service ,445: file sharing
        //3389:원격접속 ,8080: OracleDB 기본포트

        for (int i = 0; i <= 65535; i++) {
            try {
                socket = new ServerSocket(i);
                socket.close();

            } catch (Exception e) {
                System.out.println(i+"번 포트는 사용중입니다");
                //사용중인 포트는 피해
            }
        }
        System.out.println("포트 검사 마침");
    }
}
