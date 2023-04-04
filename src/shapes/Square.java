package shapes;

class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }
    @Override
    public int getArea(){
        System.out.println("this is the area");
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }
}