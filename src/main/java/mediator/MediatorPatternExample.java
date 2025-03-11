package mediator;

public class MediatorPatternExample {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Button button = new Button(mediator);
        Checkbox checkbox = new Checkbox(mediator);

        mediator.setButton(button);
        mediator.setCheckbox(checkbox);

        // 체크박스를 체크하면 버튼이 활성화됨
        checkbox.check();

        // 체크박스를 해제하면 버튼이 비활성화됨
        checkbox.uncheck();
    }
}
