package ch19;

import java.net.URL;

public class UrlInfo {
    public static void main(String[] args) {
        try {//URL class = url정보 분석하는 클래스
            URL url = new URL("https://b9kelly.tistory.com/40");
            System.out.println("protocol : "+ url.getProtocol());
            System.out.println("portNumber : "+ url.getPort());
            System.out.println("host : "+ url.getHost());
            System.out.println("file : " + url.getFile());
            System.out.println("etc : "+ url.toExternalForm());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
