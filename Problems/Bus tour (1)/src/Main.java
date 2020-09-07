import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int alt = scan.nextInt();
        int n = scan.nextInt();

        String result = null;

        for (int i = 0; i < n; i++) {
            int ponte = scan.nextInt();
            if (alt >= ponte) {
                result = "Will crash on bridge " + (i + 1);
                break;
            } else {
                result = "Will not crash";
            }
        }
        System.out.println(result);
    }
}