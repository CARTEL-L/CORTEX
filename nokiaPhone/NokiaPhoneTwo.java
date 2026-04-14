import java.util.Scanner;

public class NokiaPhoneTwo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMainMenu();
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> phoneBookMenu(scanner);
                case 2 -> messagesMenu(scanner);
                case 3 -> System.out.println("\n>>> Chat (Not implemented yet)");
                case 4 -> callRegisterMenu(scanner);
                case 5 -> tonesMenu(scanner);
                case 6 -> settingsMenu(scanner);
                case 7 -> System.out.println("\n>>> Call divert");
                case 8 -> System.out.println("\n>>> Games");
                case 9 -> System.out.println("\n>>> Calculator");
                case 10 -> System.out.println("\n>>> Reminders");
                case 11 -> clockMenu(scanner);
                case 12 -> System.out.println("\n>>> Profiles");
                case 13 -> System.out.println("\n>>> SIM services");
                case 0 -> {
                    System.out.println("\nExiting Nokia Phone...");
                    running = false;
                }
                default -> System.out.println("\nInvalid choice! Please try again.");
            }
        }
        scanner.close();
    }

    // ==================== MAIN MENU ====================
    private static void printMainMenu() {
        System.out.println("\n================ NOKIA MENU ================");
        System.out.println("1:  Phone book");
        System.out.println("2:  Messages");
        System.out.println("3:  Chat");
        System.out.println("4:  Call register");
        System.out.println("5:  Tones");
        System.out.println("6:  Settings");
        System.out.println("7:  Call divert");
        System.out.println("8:  Games");
        System.out.println("9:  Calculator");
        System.out.println("10: Reminders");
        System.out.println("11: Clock");
        System.out.println("12: Profiles");
        System.out.println("13: SIM services");
        System.out.println("0:  Exit");
        System.out.print("\nEnter choice (0-13): ");
    }

    // ==================== PHONEBOOK MENU ====================
    private static void phoneBookMenu(Scanner scanner) {
        boolean inMenu = true;
        while (inMenu) {
            System.out.println("\n----- PHONE BOOK -----");
            System.out.println("1: Search");
            System.out.println("2: Service Nos");
            System.out.println("3: Add name");
            System.out.println("4: Erase");
            System.out.println("5: Edit");
            System.out.println("6: Assign tone");
            System.out.println("7: Send b'card");
            System.out.println("8: Options");
            System.out.println("9: Speed dials");
            System.out.println("10: Voice tags");
            System.out.println("0: Back to main menu");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                inMenu = false;
            } else if (choice == 8) {
                optionsSubMenu(scanner);
            } else {
                System.out.println(">>> Selected: Option " + choice);
            }
        }
    }

    private static void optionsSubMenu(Scanner scanner) {
        boolean inSub = true;
        while (inSub) {
            System.out.println("\n----- OPTIONS -----");
            System.out.println("1: Type of view");
            System.out.println("2: Memory status");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            int ch = scanner.nextInt();
            if (ch == 0) inSub = false;
            else System.out.println(">>> " + (ch == 1 ? "Type of view" : "Memory status"));
        }
    }

    // ==================== MESSAGES MENU ====================
    private static void messagesMenu(Scanner scanner) {
        boolean inMenu = true;
        while (inMenu) {
            System.out.println("\n----- MESSAGES -----");
            System.out.println("1: Write messages");
            System.out.println("2: Inbox");
            System.out.println("3: Outbox");
            System.out.println("4: Picture messages");
            System.out.println("5: Template");
            System.out.println("6: Smileys");
            System.out.println("7: Message Settings");
            System.out.println("8: Info service");
            System.out.println("9: Voice mailbox number");
            System.out.println("10: Service command editor");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            if (choice == 0) inMenu = false;
            else if (choice == 7) messageSettingsSubMenu(scanner);
            else System.out.println(">>> Selected: " + choice);
        }
    }

    private static void messageSettingsSubMenu(Scanner scanner) {
        boolean inSub = true;
        while (inSub) {
            System.out.println("\n----- MESSAGE SETTINGS -----");
            System.out.println("1: Set");
            System.out.println("2: Common");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            int ch = scanner.nextInt();
            if (ch == 0) inSub = false;
            else if (ch == 1) setSubMenu(scanner);
            else if (ch == 2) commonSubMenu(scanner);
        }
    }

    private static void setSubMenu(Scanner scanner) {
        System.out.println("\n>>> Set submenu (Message center number, etc.)");
        // You can expand this further
    }

    private static void commonSubMenu(Scanner scanner) {
        System.out.println("\n>>> Common submenu (Delivery reports, etc.)");
    }

    // ==================== CALL REGISTER MENU ====================
    private static void callRegisterMenu(Scanner scanner) {
        boolean inMenu = true;
        while (inMenu) {
            System.out.println("\n----- CALL REGISTER -----");
            System.out.println("1: Missed calls");
            System.out.println("2: Received calls");
            System.out.println("3: Dialled numbers");
            System.out.println("4: Erase recent call lists");
            System.out.println("5: Show call duration");
            System.out.println("6: Show call costs");
            System.out.println("7: Call cost settings");
            System.out.println("8: Prepaid credit");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            if (choice == 0) inMenu = false;
            else System.out.println(">>> Selected: Option " + choice);
            // You can add more submenus like before
        }
    }

    // ==================== TONES MENU ====================
    private static void tonesMenu(Scanner scanner) {
        boolean inMenu = true;
        while (inMenu) {
            System.out.println("\n----- TONES -----");
            System.out.println("1: Ringing tone");
            System.out.println("2: Ringing volume");
            System.out.println("3: Incoming call alert");
            System.out.println("4: Composer");
            System.out.println("5: Message alert tone");
            System.out.println("6: Keypad tones");
            System.out.println("7: Warning and games tone");
            System.out.println("8: Vibrating alert");
            System.out.println("9: Screen saver");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            if (scanner.nextInt() == 0) inMenu = false;
            else System.out.println(">>> Tone selected");
        }
    }

    // ==================== SETTINGS MENU ====================
    private static void settingsMenu(Scanner scanner) {
        boolean inMenu = true;
        while (inMenu) {
            System.out.println("\n----- SETTINGS -----");
            System.out.println("1: Call settings");
            System.out.println("2: Phone settings");
            System.out.println("3: Security settings");
            System.out.println("4: Restore factory settings");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            if (choice == 0) inMenu = false;
            else if (choice == 1) callSettingsSubMenu(scanner);
            else System.out.println(">>> Selected: " + choice);
        }
    }

    private static void callSettingsSubMenu(Scanner scanner) {
        System.out.println("\n>>> Call settings submenu opened");
        // Add your sub options here
    }

    // ==================== CLOCK MENU ====================
    private static void clockMenu(Scanner scanner) {
        boolean inMenu = true;
        while (inMenu) {
            System.out.println("\n----- CLOCK -----");
            System.out.println("1: Alarm clock settings");
            System.out.println("2: Clock settings");
            System.out.println("3: Date setting");
            System.out.println("4: Stopwatch");
            System.out.println("5: Countdown timer");
            System.out.println("6: Auto update of date and time");
            System.out.println("0: Back");
            System.out.print("Choose: ");

            if (scanner.nextInt() == 0) inMenu = false;
            else System.out.println(">>> Clock option selected");
        }
    }
}
