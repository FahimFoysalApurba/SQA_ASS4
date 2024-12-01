import GenericAndNonGeneric.*;


public class Main {
    public static void main(String[] args) {

        // Non-generic Example
        Box box = new Box();
        box.setValue(10);
        System.out.println(box.getValue());
        box.setValue("Hello");
        System.out.println(box.getValue());

        //Generic Example
        Box1<Integer> intBox = new Box1<>();
        intBox.setValue(101);
        System.out.println(intBox.getValue());  // Output: 10

        Box1<String> strBox = new Box1<>();
        strBox.setValue("Hello Generic");
        System.out.println(strBox.getValue());

        //List
        FruitList fruitList = new FruitList();
        fruitList.addFruit("Apple");
        fruitList.addFruit("Banana");
        fruitList.addFruit("Orange");
        fruitList.addFruit("Banana");  // Duplicates allowed
        fruitList.printFruits();

        //set
        FruitSet f=new FruitSet();
        f.addFruit("Apple");
        f.addFruit("Banana");
        f.addFruit("Orange");
        f.addFruit("Banana");  // Duplicates will be ignored
        f.printFruits();

        //Map
        CountryMap countryCapitalMap = new CountryMap();
        countryCapitalMap.addCapital("USA", "Washington, D.C.");
        countryCapitalMap.addCapital("Canada", "Ottawa");
        countryCapitalMap.addCapital("France", "Paris");
        countryCapitalMap.printCapitals();




    }
}