
import abstractclass.DepositTransaction;
import abstractclass.WithdrawTransaction;
import classbank.BankAccount;
import classbank.CheckingAccount;
import classbank.SavingsAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        DepositTransaction depositTransaction = new DepositTransaction();
        WithdrawTransaction withdrawTransaction = new WithdrawTransaction();
        BankAccount A = new SavingsAccount(1,"A",100,10);
        BankAccount B = new CheckingAccount(1,"B",100,10);
        Map<Integer,BankAccount> listBankAccount = new HashMap<>();
        listBankAccount.put(1,A);
        listBankAccount.put(2,B);
        depositTransaction.processTransaction(listBankAccount,1,1);

        withdrawTransaction.processTransaction(listBankAccount,1,110);
        System.out.println(listBankAccount.get(1).getBalance());

        withdrawTransaction.processTransaction(listBankAccount,2,110);
        System.out.println(listBankAccount.get(2).getBalance());

        depositTransaction.processTransaction(listBankAccount,1,1);
    }
}