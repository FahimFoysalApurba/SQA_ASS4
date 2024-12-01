package GenericAndNonGeneric;
import java.util.ArrayList;
import java.util.List;

public class FruitList {
    private List<String> fruits;

    public FruitList() {
        fruits = new ArrayList<>();
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public void printFruits() {
        System.out.println("Fruits list: " + fruits);
    }
}

