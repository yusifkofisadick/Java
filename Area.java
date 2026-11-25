package start;
public class Area {

    // Area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a rectangle
    public static double calculateArea(int width, int length) {
        return width * length;
    }

    // Formula given for the cylinder
    public static double calculateArea(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {

        System.out.println("Circle area: " +
                calculateArea(5.0));

        System.out.println("Rectangle area: " +
                calculateArea(4, 6));

        System.out.println("Cylinder calculation: " +
                calculateArea(3.0, 7.0));
    }
}
