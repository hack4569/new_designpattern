package mediator;

public class Checkbox extends Component{
    public Checkbox(Mediator mediator) {
        super(mediator);
    }

    public void check() {
        System.out.println("Checkbox checked");
        mediator.notify(this, "checked");
    }

    public void uncheck() {
        System.out.println("Checkbox unchecked");
        mediator.notify(this, "unchecked");
    }
}
