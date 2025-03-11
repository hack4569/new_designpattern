package mediator;

public class Button extends Component {
    private boolean enabled = false;

    public Button(Mediator mediator) {
        super(mediator);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Button is now " + (enabled ? "enabled" : "disabled"));
    }
}
