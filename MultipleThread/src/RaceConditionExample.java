public class RaceConditionExample {
    public static void main(String[] args) {
        BankAccount husbandBankAccount = new BankAccount();

        // Người chồng rút 15 triệu
        WithdrawThread husbandThread = new WithdrawThread("Husband", husbandBankAccount, 15000000);
        husbandThread.setPriority(1);

        // Người vợ rút hết tiền (20 triệu)
        WithdrawThread wifeThread = new WithdrawThread("Wife", husbandBankAccount, 20000000);
        wifeThread.setPriority(5);

        husbandThread.start();
        wifeThread.start();
    }


}
