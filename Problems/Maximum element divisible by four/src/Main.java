import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            int y = scan.nextInt();
            if (y % 4 == 0 && x < y) {
                x = y;
            }
        }
        System.out.println(x);
    }
}