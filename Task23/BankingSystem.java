package Basic.Task23;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized boolean withdraw(int amount) {
        if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount
                    + " but insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out
                .println(Thread.currentThread().getName() + " withdrew " + amount + ". Remaining balance: " + balance);
        return true;
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(new WithdrawTask(account, 500), "Thread-1");
        Thread t2 = new Thread(new WithdrawTask(account, 700), "Thread-2");
        Thread t3 = new Thread(new WithdrawTask(account, 300), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
