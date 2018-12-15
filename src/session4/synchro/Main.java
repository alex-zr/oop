package session4.synchro;

public class Main {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Account account = new Account(200, "login", 123);
        SingleThread stOne = new SingleThread(account);
        SingleThread stTwo = new SingleThread(account);
        stOne.getMoneyFromAccount("login", 123, 150);
        stTwo.getMoneyFromAccount("login", 123, 150);
    }
}
