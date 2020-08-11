
public class BankAccount {
    long amount = 20000000; // Số tiền có trong tài khoản

    public synchronized boolean checkAccountBalance(long withDrawAmount) {
        // Giả lập thời gian đọc cơ sở dữ liệu và kiểm tra tiền
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (withDrawAmount <= amount) {
            // Cho phép rút tiền
            return true;
        }

        // Không cho phép rút tiền
        return false;
    }

    public synchronized void withdraw(String threadName, long withdrawAmount) {
        // In thông tin người rút
        System.out.println(threadName + " withdraw: " + withdrawAmount);
            if (checkAccountBalance(withdrawAmount)) {
                // Giả lập thời gian rút tiền và
                // cập nhật số tiền còn lại vào cơ sở dữ liệu
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                amount -= withdrawAmount;
            } else {
                System.out.println(threadName + " withdraw error!");
            }
        // In ra số dư tài khoản
        System.out.println(threadName + " see balance: " + amount);
    }
}
