import java.util.ArrayList;

public class Customer {

    private int customerNumber;
    private ArrayList<Address> adresses;

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public ArrayList<Address> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<Address> adresses) {
        this.adresses = adresses;
    }

    public void addAdress(Address a) {
        adresses.add(a);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", adresses=" + adresses +
                '}';
    }
}
