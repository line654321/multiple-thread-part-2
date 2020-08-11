
public class WithdrawThread extends Thread {

    String threadName = "";
    long withdrawAmount = 0;
    BankAccount bankAccount;

    public WithdrawThread(String threadName, BankAccount bankAccount, long withdrawAmount) {
        this.threadName = threadName;
        this.bankAccount = bankAccount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(threadName, withdrawAmount);
    }
}
