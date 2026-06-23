package Runner;

import com.frozen.customexception.ATM;
import com.frozen.customexception.InsufficientBalanceException;

public class ATMRunner {
    public static void main(String[] args) {
        try{
            ATM.withdraw(2000, 3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
