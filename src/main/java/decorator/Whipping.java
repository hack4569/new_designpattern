package decorator;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Hong GilDong
 */

public class Whipping implements Esspresso{
    private Esspresso esspresso;
    public Whipping(Esspresso esspresso) {
        this.esspresso = esspresso;
    }

    @Override
    public int getPrice() {
        return esspresso.getPrice() + 20;
    }
}
