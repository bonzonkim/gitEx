package ch05;

import java.util.Scanner;

public class My_First_Project {
    public static void main(String[] args) {
        int nation;
        int item;
        String food;
        Scanner sc = new Scanner(System.in);

        outter:
        while(true){
            System.out.println("==========메뉴==========");
            System.out.print("종류를 선택하세요: (1,2,3) 종료: (0)\n");
            System.out.println("(1) 한식");
            System.out.println("(2) 양식");
            System.out.println("(3) 중식");
            System.out.print("======================");
            nation = sc.nextInt();
            if (nation == 0){
                System.out.println("프로그램을 종료합니다");
                break;
            }else if(nation < 1 || nation > 3){
                System.out.println("올바른 종류를 선택해주세요 (1,2,3) 종료: (0)");
                continue ;
            }
                switch (nation) {
                    case 1:
                        System.out.println("한식을 선택하셨습니다 음식을 선택해주세요: (1,2,3) 이전으로: (0) 전체 종료: (99)\n" +
                                "(1) 된장찌개\n(2) 김치찌개\n(3)삼겹살\n(4)비빔밥");
                        item = sc.nextInt();
                        switch (item) {//한식 메뉴 switch
                            case 1:
                                food = "된장찌개";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 2:
                                food = "김치찌개";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 3:
                                food = "삼겹살";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 4:
                                food = "비빔밥";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 0:
                                break;
                            case 99:
                                System.out.println("프로그램을 종료합니다");
                                break outter;
                            default:
                                System.out.println("올바른 메뉴를 선택해 주세요");
                        }
                        break;//한식 switch 끝
                    case 2:
                        System.out.println("양식을 선택하셨습니다 음식을 선택해주세요: (1,2,3) 이전으로: (0) 전체 종료: (99)\n" +
                                "(1) 팬케이크\n(2) 스테이크\n(3)럼버잭");
                        item = sc.nextInt();
                        switch (item) {//양식 switch
                            case 1:
                                food = "팬케이크";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 2:
                                food = "스테이크";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 3:
                                food = "럼버잭";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 0:
                                break;
                            case 99:
                                System.out.println("프로그램을 종료합니다");
                                break outter;
                            default:
                                System.out.println("올바른 메뉴를 선택해 주세요");
                        }
                        break;//양식 switch 끝
                    case 3:
                        System.out.println("중식을 선택하셨습니다 음식을 선택해주세요: (1,2,3) 이전으로: (0) 전체 종료: (99)\n" +
                                "(1) 짜장면\n(2) 짬뽕\n(3) 탕수육");
                        item = sc.nextInt();
                        switch (item) {//중식 switch
                            case 1:
                                food = "짜장면";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 2:
                                food = "짬뽕";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 3:
                                food = "탕수육";
                                System.out.println("고객님은 " + food + "를 선택하셨습니다");
                                break;
                            case 0:
                                break;
                            case 99:
                                System.out.println("프로그램을 종료합니다");
                                break outter;
                            default:
                                System.out.println("올바른 메뉴를 선택해 주세요");
                        }
                        break;//중식 switch끝
                }//음식 종류 switch 끝
            }//while 끝
        }
    }

