package abstractclass;

import classbank.BankAccount;

import java.util.Map;

// Trừu tượng
public abstract class Transaction {
    public Transaction() {
    }
    public abstract boolean processTransaction(Map<Integer,BankAccount> list, Integer accountNumber, double amount);
    public abstract void printTransactionDetails(boolean isTrue);

}
