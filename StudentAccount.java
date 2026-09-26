public class StudentAccount extends BankAccountSystem {
    @Override
    public double calculateCharges() {
        return getBalance() * 0.005;
    }    
}
