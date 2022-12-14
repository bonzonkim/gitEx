package ch16;

public class BankUse {
    public static void main(String[] args) {
        MyBank bank = new MyBank();

        BankPlayer hong = new BankPlayer("hong",bank);
        BankPlayer sin = new BankPlayer("sin",bank);
        BankPlayer lee = new BankPlayer("lee",bank);

        hong.start();
        sin.start();
        lee.start();
    }

}
