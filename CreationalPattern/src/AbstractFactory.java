import Color.Color;
import Shape.Shape;

/**
 * @author zdh
 * @date 2021/8/9 20:11
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
