package mediator;

public class ConcreteMediator implements Mediator {
    private Button button;
    private Checkbox checkbox;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
    }

    @Override
    public void notify(Component sender, String event) {
        if (!(sender instanceof Checkbox)) {
            return;
        }
        if (event.equals("checked")) {
            button.setEnabled(true);
        } else if (event.equals("unchecked")) {
            button.setEnabled(false);
        }
    }
}
