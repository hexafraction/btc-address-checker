package io.github.hexafraction.balance_checker;

/**
 * Created by Andrey Akhmetov on 6/26/2016.
 */
public class Address {
    final String addr;

    @Override
    public String toString() {
        return addr;
    }

    double balance = 0;
    boolean validBalance = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return addr.equals(address.addr);

    }

    @Override
    public int hashCode() {
        return addr.hashCode();
    }

    public Address(String addr) {
        this.addr = addr;
    }
}
