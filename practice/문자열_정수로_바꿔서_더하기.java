package practice;

public class 문자열_정수로_바꿔서_더하기 {
    public static void main(String[] args) {

        String str = "3 + 5";
        int answer =0;
        String[] strarr = str.split(" ");
        for (int b = 0; b< strarr.length; b++){
            System.out.print(strarr[b]);
        answer = Integer.parseInt(strarr[0]);

        for (int i =1; i< strarr.length; i+=2){
            if(strarr[i].equals("+")){
                answer += Integer.parseInt(strarr[i+1]);
            }else{
                answer -= Integer.parseInt(strarr[i+1]);
            }
        }
        //System.out.println(answer);

}

    }
}
