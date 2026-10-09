public class Account {
    private double balance;

    public Account(double initBalance) {
        this.balance = initBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    // Menyetor uang, berhasil jika jumlah lebih dari 0
    public boolean deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            return true;
        }
        return false;
    }

    // Menarik uang, berhasil jika jumlah valid dan saldo cukup
    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= this.balance) {
            this.balance -= amt;
            return true;
        }
        return false;
    }
}