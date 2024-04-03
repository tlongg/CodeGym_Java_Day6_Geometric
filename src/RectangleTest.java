public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);

        rectangle = new Rectangle(7.5,4.6);
        System.out.println(rectangle);

        rectangle = new Rectangle("Yellow", true, 3.5, 7.8);
        System.out.println(rectangle);
    }
}
