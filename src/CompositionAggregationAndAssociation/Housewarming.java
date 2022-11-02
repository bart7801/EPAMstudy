//Consider, for example, the class Apartment as well as the classes Furniture and Wall.
//
//We can say that an apartment has walls and some furniture. But if you think about it,
//there is a significant difference between the objects of walls and furniture.
//Walls (especially bearing ones) are built during the construction of an apartment.
//Therefore, an object of the Wall class will be created and destroyed, respectively,
//when an object of the Apartment class is created and destroyed. This is an example of composition.
//Before getting into a certain apartment, furniture is produced somewhere. We can buy different furniture,
//throw it away, transport it to different apartments, and so on. That is, when creating the Apartment object,
//the Furniture object is passed as a parameter of some method, and when the Apartment object is destroyed,
//the Furniture object can be passed to another Apartment object. This is an example of aggregation.
//
//Rozważmy na przykład klasę Mieszkanie oraz klasy Meble i Ściana.
//
//Można powiedzieć, że mieszkanie ma ściany i trochę mebli. Ale jeśli się nad tym zastanowić,
//istnieje znacząca różnica między przedmiotami ścian i mebli. Ściany (zwłaszcza nośne) budowane są podczas budowy mieszkania.
//W związku z tym podczas tworzenia i niszczenia obiektu klasy Mieszkanie zostanie odpowiednio utworzony i zniszczony obiekt klasy Wall.
//To jest przykład kompozycji. Przed wejściem do konkretnego mieszkania gdzieś produkuje się meble.
//Możemy kupować różne meble, wyrzucać je, przewozić do różnych mieszkań i tak dalej. Oznacza to,
//że podczas tworzenia obiektu Apartment obiekt Furniture jest przekazywany jako parametr jakiejś metody,
//a po zniszczeniu obiektu Apartment obiekt Furniture może zostać przekazany do innego obiektu Apartment.
//To jest przykład agregacji.

package CompositionAggregationAndAssociation;

public class Housewarming {
    public static void main(String[] args) {
        Furniture[] furniture = new Furniture[]{
                new Furniture("bed", 150),
                new Furniture("cupboard", 250),
                new Furniture("table", 35),
                new Furniture("armchair", 80),
        };
        Apartment flat1 = new Apartment("Bronco", 3050, "brick", 23, furniture);

        System.out.println("Information about the first apartment:\n" + flat1);
        System.out.println("Total furniture cost is: $" + flat1.getTotalFurnitureCost(furniture));
    }
}
//The result:
//
//Information about the first apartment:
//The address is 'Bronco St' 3050, walls material is 'brick', high = 23 ft., furniture=[
//name = 'bed', cost = $150,
//name = 'cupboard', cost = $250,
//name = 'table', cost = $35,
//name = 'armchair', cost = $80]
//Total furniture cost is: $515