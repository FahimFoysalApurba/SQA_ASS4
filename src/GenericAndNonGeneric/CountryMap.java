package GenericAndNonGeneric;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {
    private Map<String, String> capitals;

    public CountryMap() {
        capitals = new HashMap<>();
    }

    public void addCapital(String country, String capital) {
        capitals.put(country, capital);
    }

    public void printCapitals() {
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
