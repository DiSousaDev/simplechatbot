import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean b = scanner.nextBoolean();

        if (n >= 10 && n <= 20 && !b) {
            System.out.println("true");
        } else if (n >= 15 && n <= 25 && b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}