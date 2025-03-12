package visitor;

public class ShapePrinter implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("이것은 반지름 " + circle.getRadius() + "인 원입니다.");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("이것은 너비 " + rectangle.getWidth() + ", 높이 " + rectangle.getHeight() + "인 직사각형입니다.");
    }
}
