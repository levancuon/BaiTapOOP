package abstractclass;

import classbank.BankAccount;

import java.util.List;
import java.util.Map;

//  kế thừa
public class WithdrawTransaction extends Transaction {

    // constructor có thể nạp chồng ( đa hình )
    public WithdrawTransaction() {
    }

    // ghi đè ( đa hình )
    @Override
    public boolean processTransaction(Map<Integer, BankAccount> list, Integer accountNumber, double amount) {
        if (!list.containsKey(accountNumber)) {
            printTransactionDetails(false);
            return false;
        }else {
            BankAccount bankAccount = list.get(accountNumber);
            if (bankAccount.withdraw(amount)){
                printTransactionDetails(true);
                return true;
            }
            printTransactionDetails(false);
            return false;
        }

    }

    // ghi đè ( Đa hình )
    @Override
    public void printTransactionDetails(boolean isTrue) {
        if (isTrue) {
            System.out.println("Rút thành công");
        } else {
            System.out.println("Rút thất bại");
        }
    }
}
