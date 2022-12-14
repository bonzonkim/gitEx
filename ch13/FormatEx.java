package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
    public static void main(String[] args) {
        //3자리수 콤마 표시
        //1)String을 활용
        int val = 1234000000;
        String str = String.format("%,d",val);
        System.out.println(str);

        //2)DecimalFormat활용
        DecimalFormat df = new DecimalFormat("###,###.##");
        String num = df.format(123400000.3232042);
        System.out.println(num);

        //3) NumberFormat
        NumberFormat nf = NumberFormat.getInstance();
        String num2 = nf.format(123400000.1234);
        System.out.println(num2);


        //getInstance(Locale.국가) - 해당국가 표기법 기본은 미국 Locale.US
        NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
        String num3 = nf2.format(12340000.1234);
        System.out.println(num3);
    }
}
