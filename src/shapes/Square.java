package shapes;

//class Square extends Rectangle {
//    public Square(int side) {
//        super(side, side);
//    }
//    @Override
//    public int getArea(){
//        System.out.println("this is the area");
//        return length * length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * length;
//    }
//}

public class Square extends Quadrilateral {
    public Square(int length) {
        super(length, length);
    }

    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
