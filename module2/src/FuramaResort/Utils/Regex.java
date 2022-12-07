package FuramaResort.Utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public String enterVillaInfo() {
        String string;
        String villaRegex = "SVVL-\\d{4}";
        do {
            string = scanner.nextLine();
            if (string.matches(villaRegex)) {
                return string;
            } else {
                System.out.println("Try again!!!");
            }
        } while (true);
    }

    public String enterRoomInfo() {
        String string;
        String roomRegex = "SVRO-\\d{4}";
        do {
            string = scanner.nextLine();
            if (string.matches(roomRegex)) {
                return string;
            } else {
                System.out.println("Try again!!!");
            }
        } while (true);
    }
    public String enterServiceInfo() {
        String string;
        String serviceRegex = "[A-Z][a-z0-9]*";
        do {
            string = scanner.nextLine();
            if (string.matches(serviceRegex)) {
                return string;
            } else {
                System.out.println("Try again!!!");
            }
        } while (true);
    }

}
