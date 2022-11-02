package Pizza;

import java.util.List;

class Order {           //class for an order
    public String name;
    public String address;
    List<Pizza> list;
    float sum = 0;

    public Order(String name, String address, List<Pizza> list, float sum) {
        this.name = name;
        this.address = address;
        this.list = list;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Name " + this.name + "; Address: " + this.address + "; Total amount - " + this.sum;
    }
}