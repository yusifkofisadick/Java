
public class PressureConversion {
    public static void main(String[] args) {

        double kilopascals;

        System.out.println("Torr\tKilopascals");
        System.out.println("-----------------------");

        for (int torr = 1; torr <= 10; torr++) {

            kilopascals = torr * (132.0 / 1000);

            System.out.printf("%d\t%.3f%n",
                              torr, kilopascals);
        }
    }
}
