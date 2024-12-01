package GenericAndNonGeneric;

public class Box1 <T>{
    private T value;  // T is a placeholder for any type

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
