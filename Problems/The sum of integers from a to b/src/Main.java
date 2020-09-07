import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int sum = 0;

        for (int i = n1; i <= n2; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}