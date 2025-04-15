package decorator;

public class Arabica implements Esspresso{
    public Arabica() {}
    @Override
    public int getPrice() {
        return 50;
    }
}
