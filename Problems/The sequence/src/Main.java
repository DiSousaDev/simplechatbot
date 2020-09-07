import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j = 0;

        for (int i = 1; i <= n; i++) {
            int count = 1;
            while (count <= i) {
                System.out.print(i + " ");
                count++;
                j++;
                if (j == n) {
                    i = j;
                    break;
                }
            }
        }
    }
}