package start;
public class RecursiveMultiplication {

    public static int multiply(int x, int y) {

        if (x == 0) {
            return 0;
        }

        return y + multiply(x - 1, y);
    }

    public static void main(String[] args) {

        int answer = multiply(7, 4);

        System.out.println("The answer is: " + answer);
    }
}
