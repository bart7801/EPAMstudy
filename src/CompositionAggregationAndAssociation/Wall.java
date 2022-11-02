package CompositionAggregationAndAssociation;

class Wall {
    public String material;
    public int high;

    public Wall(String material, int high) {
        this.material = material;
        this.high = high;
    }

    @Override
    public String toString() {
        return "material is '" + material + '\'' +
                ", high = " + high + " ft.";
    }
}
