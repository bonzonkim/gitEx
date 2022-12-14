package ch19;

import java.net.InetAddress;

public class InetAddressExam {
    public static void main(String[] args) {
        try{ //네트워크 프로그램도 try-catch필수
            InetAddress address = InetAddress.getByName("google.com");
            System.out.println(address); //getbyname()호스트이름,ip주소 가져옴
            System.out.println(address.getHostName()); //호스트이름
            System.out.println(address.getHostAddress()); //ip주소값
        } catch (Exception e) {

        }
    }
}
