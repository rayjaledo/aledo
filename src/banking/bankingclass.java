package banking;

public class BankingClass {
    
    private int accNo;
    private double balance;
    private int pin;

    
    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public int getAccNo() {
        return accNo;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public boolean verifyAccount(int accn, int pn) {
        return accNo == accn && pin == pn;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: ₱" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    
}
