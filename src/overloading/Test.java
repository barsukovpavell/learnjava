package overloading;

public class Test {
    public static void main(String[] args) {

        Multicooker cooker = new Multicooker();

        cooker.cook(new Rice(), new Water());
        cooker.cook(new Meat(), new Spices());
    }
}
