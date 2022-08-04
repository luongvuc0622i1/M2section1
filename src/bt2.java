import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String isNumber = "";


        switch (number) {
            case 1:
                isNumber = "one";
                break;
            case 2:
                isNumber = "two";
                break;
            case 3:
                isNumber = "three";
                break;
            case 4:
                isNumber = "four";
                break;
            case 5:
                isNumber = "five";
                break;
            case 6:
                isNumber = "six";
                break;
            case 7:
                isNumber = "seven";
                break;
            case 8:
                isNumber = "eight";
                break;
            case 9:
                isNumber = "nine";
                break;
            case 10:
                isNumber = "ten";
                break;
            case 11:
                isNumber = "eleven";
                break;
            case 12:
                isNumber = "twelve";
                break;
            case 13:
                isNumber = "thirteen";
                break;
            case 14:
                isNumber = "fourteen";
                break;
            case 15:
                isNumber = "fifteen";
                break;
            case 16:
                isNumber = "sixteen";
                break;
            case 17:
                isNumber = "seventeen";
                break;
            case 18:
                isNumber = "eighteen";
                break;
            case 19:
                isNumber = "nineteen";
                break;
            case 20:
                isNumber = "twenty";
                break;
        }
        System.out.println("Number is: " + isNumber);
    }
}
