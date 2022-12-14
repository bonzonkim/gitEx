package ch19;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class LanInfo {
    public static void main(String[] args) {
        try{
            //NetworkInterface : 랜카드정보
            //getNetworkInterfaces : 네트워크 인터페이스의 다양한 정보 제공
            Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
            while (enu.hasMoreElements()) {
                NetworkInterface net = enu.nextElement();
                System.out.println(net);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
