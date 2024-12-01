package GenericAndNonGeneric;
import java.util.HashSet;
import java.util.Set;

public class FruitSet {
    private Set<String> fruits;

    public FruitSet() {
        fruits = new HashSet<>();
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public void printFruits() {
        System.out.println("Fruits set: " + fruits);
    }
}
