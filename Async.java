class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String threadName, int amount) {
        System.out.println(threadName + " trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " processing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            balance -= amount;
            System.out.println(threadName + " completed. Remaining balance: " + balance);
        } else {
            System.out.println(threadName + " failed! Insufficient balance: " + balance);
        }
    }
}

class WithdrawTask extends Thread {
    private final BankAccount account;
    private final int amount;

    public WithdrawTask(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(getName(), amount);
    }
}

public class Async {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new WithdrawTask(account, 700, "t1");
        Thread t2 = new WithdrawTask(account, 500, "t2");

        t1.start();
        t2.start();
    }
}
 Brijesh2100$