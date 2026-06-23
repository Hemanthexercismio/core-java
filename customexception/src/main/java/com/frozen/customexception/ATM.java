package com.frozen.customexception;

public class  ATM {
    public static void withdraw(double balance , double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        System.out.println("withdrawel succes and balamce is =" +(balance - amount));
    }
}
