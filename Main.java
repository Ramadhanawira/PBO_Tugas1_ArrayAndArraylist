public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Wira", "Buana");
        bank.addCustomer("Amar", "Zulkifli");

        Customer Agus = bank.getCustomer(0);
        Agus.setAccount(new Account(10000.0));
        Agus.setAccount(new Account(5000.0));

        Agus.getAccount(0).deposit(25000);
        Agus.getAccount(1).withdraw(10000);

        Customer Amar = bank.getCustomer(1);
        Amar.setAccount(new Account(20000.0));

        System.out.println("Jumlah nasabah: " + bank.getNumOfCustomers());

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);
            System.out.println("\nNasabah: " + c.getFirstName() + " " + c.getLastName());
            System.out.println("Jumlah rekening: " + c.getNumOfAccounts());
            for (int j = 0; j < c.getNumOfAccounts(); j++) {
                System.out.println("  Rekening " + (j + 1) + ": " + c.getAccount(j).getBalance());
            }
        }
    }
}