package decorator;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Hong GilDong
 */
public class Starbucks {
    public static void main(String[] args) {
        Esspresso coffe = new DarkRoast();
        coffe = new Whipping(coffe);
        System.out.println(coffe.getPrice());
        Esspresso coffe2 = new Arabica();
        coffe2 = new Whipping(coffe2);
        System.out.println(coffe2.getPrice());
    }
}
