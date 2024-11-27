package classbank;
// mở rộng kế thừa thuộc tính, method từ lớp BankAccount (Kế thừa)
public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // ghi đè method lớp cha
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }


    // getter setter (đóng gói)
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // đa hình
    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
