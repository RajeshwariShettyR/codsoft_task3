public class task3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance of $500
        ATM atm = new ATM(account);
        ATMInterface atmInterface = new ATMInterface(atm);
        atmInterface.start();
    }
}
