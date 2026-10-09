import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> daftarNasabah;

    public Bank() {
        this.daftarNasabah = new ArrayList<Customer>();
    }

    public void addCustomer(String firstName, String lastName) {
        Customer nasabahBaru = new Customer(firstName, lastName);
        this.daftarNasabah.add(nasabahBaru);
    }

    public int getNumOfCustomers() {
        return this.daftarNasabah.size();
    }

    public Customer getCustomer(int nomor) {
        if (nomor < 0 || nomor >= this.daftarNasabah.size()) {
            return null;
        }
        return this.daftarNasabah.get(nomor);
    }
}