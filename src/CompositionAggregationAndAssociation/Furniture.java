package CompositionAggregationAndAssociation;

class Furniture {
    public String name;
    public int cost;

    public Furniture(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\nname = '" + name + '\'' +
                ", cost = $" + cost;
    }
}
