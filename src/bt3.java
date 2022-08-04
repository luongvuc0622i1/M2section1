import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rate: (23000)");
        int rate = scanner.nextInt();

        System.out.println("Enter USD: ");
        int usd = scanner.nextInt();

        int vnd = usd*rate;
        System.out.println("VND: " + vnd + " vnđ");
    }
}
