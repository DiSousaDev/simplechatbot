import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        do {
            n1 = scan.nextInt();
            n2 += n1;
        } while (n1 != 0);
        System.out.println(n2);
    }
}