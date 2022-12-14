package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
    public static void main(String[] args) throws MalformedURLException {
        String website = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.nationalgeographic.com%2Fanimals%2Fmammals%2Ffacts%2Fspotted-hyena&psig=AOvVaw3sEHxCP9kwN8rWfrcgZcfF&ust=1670984335349000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJj-zu_D9fsCFQAAAAAdAAAAABAE";
        System.out.println("다운로드를 시작 합니다");
        URL url = new URL(website);
        byte[] buffer = new byte[2048]; //2048byte = 2mb
        //try-with
        //finally가 없어도 리소스 자동 종료
        //try(리소스 선언)
        //catch
        try(InputStream in = url.openStream();
            OutputStream out = new FileOutputStream("/Users/b9/Desktop/test.jpg")){
            int length = 0; // 읽은 바이트수 리턴
            while ((length = in.read(buffer)) != -1) { //읽을 내용이 있으면
                System.out.println(length + " read byte");
                out.write(buffer,0,length);
            }
            System.out.println("다운로드 완료되었습니다");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
