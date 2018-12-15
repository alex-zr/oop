package session4.synchro;

public class SingleThread implements Runnable {
    private Account account;
    private String login;
    private long password;
    private int sum;
    public SingleThread(Account account) {
        super();
        this.account = account;
    }
    public void getMoneyFromAccount(String login, long password, int sum) {
        this.password = password;
        this.login = login;
        this.sum = sum;
        Thread threat = new Thread(this);
        threat.start();
    }
    public void run() {
        account.takeMoney(this.login, this.password, this.sum);
    }
}
