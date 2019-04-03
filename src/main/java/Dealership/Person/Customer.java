package Dealership.Person;

public class Customer extends Person {

    private double wallet;

    public Customer(String name, double wallet) {
        super(name);
        this.wallet = wallet;
    }


    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double buyCar(double amount)  {
        this.wallet -= amount;
        return amount;
    }
}
