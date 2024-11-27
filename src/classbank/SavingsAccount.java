package classbank;

// mở rộng kế thừa thuộc tính, method từ lớp BankAccount (Kế thừa)
public class SavingsAccount extends BankAccount {

    private double interestRate;

    // các constructor có thể nạp chồng nhiều loại khác nhau ( tính đa hình )
    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // ghi đè lại phương thức lớp cha (đa hình)
    @Override
    public boolean withdraw(double amount) {
        if (getBalance() <= amount) {
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
