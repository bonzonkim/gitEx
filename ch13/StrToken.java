package ch13;

import java.util.StringTokenizer;

public class StrToken {
    public static void main(String[] args) {
        String str = "kim,20,180,55,서울,학생";
        String[] items = str.split(",");//,를 기준으로 데이터 분리
        for(String s : items){
            System.out.println(s);
        }
        StringTokenizer st = new StringTokenizer(str,",");
        int cnt = st.countTokens();//토큰의 개수 리턴
        System.out.println("token : " + cnt);
        while (st.hasMoreElements()){//다음 토큰이 있을때까지 반복
            System.out.println(st.nextToken());//토큰하나를 가져와서 리턴
        }
    }
}
