package classbank;

public class BankAccount {
    // private là tính đóng gói
    private Integer accountNumber;
    private String accountHolder;
    private Double balance;

    // các constructor có thể nạp chồng nhiều loại khác nhau (Tính đa hình)
    public BankAccount() {}
    public BankAccount(Integer accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        setBalance(balance - amount);
        return true;
    }


    // get set thuộc tính đóng gói
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // overide thuộc tính đa hình
    @Override
    public String toString() {
        return "subclass.BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
