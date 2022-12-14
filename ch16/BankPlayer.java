package ch16;

public class BankPlayer extends Thread {
    String person;
    MyBank bank;

    public BankPlayer(String person, MyBank bank) {
        this.person = person;
        this.bank = bank;
    }


    @Override
    public void run() {
        switch (person) {
            case "hong": bank.hong();
            break;
            case "sin": bank.sin();
            break;
            case "lee": bank.lee();
            break;

        }
    }
}
