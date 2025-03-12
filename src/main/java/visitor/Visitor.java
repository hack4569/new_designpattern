package visitor;

import javax.sound.sampled.Line;
import java.awt.*;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
