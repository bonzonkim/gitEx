package ch09;

class Bank{
    double getInterestRate(){
        return 0.0;
    }
}

class BadBank extends Bank{
    @Override
    double getInterestRate() {
        return 10.0;
    }
}

class NormalBank extends Bank{
    @Override
    double getInterestRate() {
        return 5.0;
    }
}


class GoodBank extends Bank{
    @Override
    double getInterestRate() {
        return 3.0;
    }
}









public class BankTest {
    public static void main(String[] args) {
        BadBank bb = new BadBank();
        NormalBank nb = new NormalBank();
        GoodBank gb =  new GoodBank();

        System.out.println("Bad bank 의 이자율 : "+bb.getInterestRate());
        System.out.println("Normal bank 의 이자율 : "+nb.getInterestRate());
        System.out.println("Good bank 의 이자율 : "+gb.getInterestRate());

    }
}
