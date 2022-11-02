package CompositionAggregationAndAssociation;

import java.util.Arrays;

class Apartment {
    public String street;
    public int apartmentNo;
    private Wall walls;
    private Furniture[] furniture;

    public Apartment(String street, int apartmentNo, String material, int high, Furniture[] furniture) {
        this.street = street;
        this.apartmentNo = apartmentNo;
        walls = new Wall(material, high);
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "The address is" +
                " '" + street + " St' " +
                apartmentNo + ", walls " + walls +
                ", furniture=" + Arrays.toString(furniture);
    }

    public int getTotalFurnitureCost(Furniture[] furniture) {
        int totalAmount = 0;
        for (Furniture furnit : furniture) {
            totalAmount += furnit.cost;
        }
        return totalAmount;
    }
}