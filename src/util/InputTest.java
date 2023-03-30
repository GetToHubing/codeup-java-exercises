package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        System.out.println(test.getString());
        System.out.println(test.yesNo());
        System.out.println(test.getInt());
        System.out.println(test.getInt(6, 12));
        System.out.println(test.getDouble());
        System.out.println(test.getDouble(1.23243231, 2.324134432));
    }
}
