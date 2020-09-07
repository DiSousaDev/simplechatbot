import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 1;
        int total = 1;

        while (total <= num) {
            System.out.println(total);
            count++;
            total = count * count;
        }
    }
}