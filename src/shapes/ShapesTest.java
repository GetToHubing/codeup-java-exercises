package shapes;

public class ShapesTest {

    static Measurable myShape = new Square(5);
    static Measurable myRectangle = new Rectangle(5, 6);
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Quadrilateral box1 = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle.getArea());


    }
}
