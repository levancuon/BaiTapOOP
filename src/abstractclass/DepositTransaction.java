package abstractclass;

import classbank.BankAccount;

import java.util.Map;
// kế thừa
public class DepositTransaction extends Transaction {
    // constructor có thể nạp chồng ( đa hình )
    public DepositTransaction() {
    }

    // ghi đè ( Đa hình )
    @Override
    public boolean processTransaction(Map<Integer, BankAccount> list, Integer accountNumber, double amount) {
        if (!list.containsKey(accountNumber)) {
            printTransactionDetails(false);
            return false;
        }
            BankAccount bankAccount = list.get(accountNumber);
            bankAccount.setBalance(bankAccount.getBalance()+amount);
            printTransactionDetails(true);
            return true ;
    }

    // ghi đè ( Đa hình )
    @Override
    public void printTransactionDetails(boolean isTrue) {
        if (isTrue){
            System.out.println("Nạp tiền thành công");
        } else {
            System.out.println("Nạp tiền thất bại");
        }
    }
}
