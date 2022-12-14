package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
    //프로그램 ==> 원격컴퓨터의 리소스 (inputStream)
    //프로그램 <== 원격컴퓨터의 리소스 (outputStream)
    //1. 원격컴퓨터에 접속
    //2.스트림 생성
    //3. 입출력

    public static void main(String[] args) {
        URL url = null;
        try{
            url = new URL("http://google.com");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            if(conn != null){
                //서버에 접속해쓴ㄴ데 일정시간 응답이 없으면 종료시킴
                conn.setConnectTimeout(3000);//타임아웃 시간 설정
                StringBuilder sb = new StringBuilder();
                //정상적인 처리의 경우
                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    //스트림 사용 html source code 읽어옴
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
                    while (true){
                        String line = br.readLine();//한 라인 읽음
                        if(line == null) break;
                        sb.append(line + "\r\n");
                    }
                    br.close();
                }
                conn.disconnect();//http 연결종료
                System.out.println(sb);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
