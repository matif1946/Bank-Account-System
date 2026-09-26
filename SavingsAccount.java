public class SavingsAccount extends BankAccountSystem {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateCharges() {
        return getBalance() * 0.01;
    }
    

}
