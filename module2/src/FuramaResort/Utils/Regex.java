package FuramaResort.Utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public String enterVillaInfo() {
        String string;
        String VILLA_REGEX = "SVVL-\\d{4}";
        do {
            string = scanner.nextLine();
            if (string.matches(VILLA_REGEX)) {
                return string;
            } else {
                System.out.println("Try again!!!");
            }
        } while (true);
    }

    public String enterRoomInfo() {
        String string;
        String ROOM_REGEX = "SVRO-\\d{4}";
        do {
            string = scanner.nextLine();
            if (string.matches(ROOM_REGEX)) {
                return string;
            } else {
                System.out.println("Try again!!!");
            }
        } while (true);
    }
    public String enterServiceInfo() {
        String string;
        String SERVICE_REGEX = "[A-Z][a-z0-9]*";
        do {
            string = scanner.nextLine();
            if (string.matches(SERVICE_REGEX)) {
                return string;
            } else {
                System.out.println("Try again!!!");
            }
        } while (true);
    }
    public String enterWord() {
        String word;
        do {
            word = scanner.nextLine();
            if (word.length() != 0) {
                return word;
            }
            System.out.println("Try again");
        } while (true);
    }

    public String enterEmail() {
        String email;
        String MAIL_REGEX = "[a-zA-Z]+\\w+@\\w+(\\.\\w+)+";
        do {
            email = scanner.nextLine();
            if (email.matches(MAIL_REGEX)) {
                return email;
            }
            System.out.println("Try again");
        } while (true);
    }
}
