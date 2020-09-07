import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while (scan.hasNext()) {
            n = scan.nextInt();
            if (n == 0 || sum >= 1000) {
                System.out.println(sum >= 1000 ? sum - 1000 : sum);
                break;
            }
            sum += n;
        }

    }
}