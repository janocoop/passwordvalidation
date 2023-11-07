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

    public static boolean checkcase(String password) {
        String lowerCasePassword = password.toLowerCase();
        if (lowerCasePassword.equals(password)) {
            return false;
        }
        String upperCasePassword = password.toUpperCase();
        if (upperCasePassword.equals(password)) {
            return false;
        }
        return true;
    }

    public static boolean checkUnsave(String password) {
        String[] badPassword = new String[3];
        badPassword[0] = "ABCDEFGH";
        badPassword[1] = "abcdefgh";
        badPassword[2] = "12345678";

        for (int a = 0; a < badPassword.length; a++) {
            if (password.equals(badPassword[a])) {
                return false;
            }

        }
      return true;
    }

}