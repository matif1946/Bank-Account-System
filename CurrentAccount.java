public class CurrentAccount extends BankAccountSystem {
    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateCharges() {
        return getBalance() * 0.02;
    }

    
}
