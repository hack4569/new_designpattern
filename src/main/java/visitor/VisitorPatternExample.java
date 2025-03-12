package visitor;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaCalculator = new AreaCalculator();
        Visitor shapePrinter = new ShapePrinter();

        circle.accept(areaCalculator);   // 원의 면적 계산
        rectangle.accept(areaCalculator); // 직사각형의 면적 계산

        circle.accept(shapePrinter);   // 원 출력
        rectangle.accept(shapePrinter); // 직사각형 출력
    }
}
