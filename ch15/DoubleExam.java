package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
    //2개 이상의 예외가 함께 발생할 경우(세부적인 예외부터 처리)

    public static void main(String[] args) {
        int num = 50;
        Scanner sc = null;
        try{
            System.out.println("숫자를 입력하세요 : ");
            sc = new Scanner(System.in);
            int value = sc.nextInt();
            System.out.println(num/value);
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (ArithmeticException a){
            System.out.println("Arithmetic Exception-cannot divide by 0");
        }catch (InputMismatchException i){
            System.out.println("please input Integer only");
        }catch (Exception e){
            System.out.println("Etc");
        }finally {//예외여부 상관없이 항상실행 (필수는아님)
            if (sc != null ){ // if문으로 걸러주지 않으면 scan이 없는데 닫으려고하면
                                //finally안에서 예외가 발생할 수 있음
                sc.close();
            }
        }
        System.out.println("program over");
    }
}
