import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n < 1) {
            System.out.println("no army");
        } else if (n >= 1 && n < 20) {
            System.out.println("pack");
        } else if (n >= 20 && n < 250) {
            System.out.println("throng");
        } else if (n >= 250 && n < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}