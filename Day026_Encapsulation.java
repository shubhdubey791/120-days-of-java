/**
 * ============================================
 * 120 Days of Java Learning - Day 26
 * Topic: Encapsulation
 * ============================================
 * Encapsulation data ko private rakh kar getters/setters se access karna hota hai.
 * Ye data hiding aur controlled access provide karta hai.
 */
public class Day026_Encapsulation {

    public static void main(String[] args) {

        class BankAccount {
            private double balance = 1000;
            public double getBalance() { return balance; }
            public void deposit(double amt) { if (amt > 0) balance += amt; }
        }
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());
    }

}
