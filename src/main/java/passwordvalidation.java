import java.util.Scanner;

public class passwordvalidation {
    public static void main(String[] args) {
        System.out.println("Geben Sie ein Passwort ein:");
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        System.out.println(password);

    }

    public static boolean checklenght(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNumber(String password) {
        char[] passwordcharacters = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(passwordcharacters[i])) {
                return true;
            }

        }
            return false;

    }

}
