public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();

            savings.setAccountNumber(101);
            savings.setAccountHolder("Atif");
            savings.setBalance(10000);
            savings.setInterestRate(5);

        CurrentAccount current = new CurrentAccount();

            current.setAccountNumber(102);
            current.setAccountHolder("Ali");
            current.setBalance(15000);
            current.setOverdraftLimit(5000);
        
        savings.deposit(2000);
        savings.withdraw(1000);

        current.deposit(3000);
        current.withdraw(2000);

    
        System.out.println("Savings Account");
        System.out.println("Account Number: " + savings.getAccountNumber());
        System.out.println("Account Holder: " + savings.getAccountHolder());
        System.out.println("Balance: " + savings.getBalance());
        System.out.println("Interest Rate: " + savings.getInterestRate());
        System.out.println("Charges: " + savings.calculateCharges());


        
        System.out.println("\nCurrent Account");
        System.out.println("Account Number: " + current.getAccountNumber());
        System.out.println("Account Holder: " + current.getAccountHolder());
        System.out.println("Balance: " + current.getBalance());
        System.out.println("Overdraft Limit: " + current.getOverdraftLimit());
        System.out.println("Charges: " + current.calculateCharges());

        
        BankAccountSystem account;

        account = savings;
        System.out.println("\nSavings Account Charges: " + account.calculateCharges());

        account = current;
        System.out.println("Current Account Charges: " + account.calculateCharges());

        account = new StudentAccount();
        account.setBalance(20000);
        System.out.println("Student Account Charges: " + account.calculateCharges());
    }
}
