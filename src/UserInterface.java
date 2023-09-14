import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private Credits credit = new Credits();
    private RmDuplicates remove = new RmDuplicates();
    private int choice;


    public void Start() {
        while (true) {
            scan = new Scanner(System.in);
            System.out.println("Welcome! Let's remove some duplicates!");
            System.out.println("1. Remove duplicates");
            System.out.println("2. Credits");
            System.out.println("3. Quit");
            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong! Try again!");
                Start();
            }
            switch (choice) {
                case 1 -> remove.remove();
                case 2 -> credit.ShowCredits();
                case 3 -> {
                    return;
                }
                default -> {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Wrong choice. Retry!");
                    Start();
                }
            }
        }
    }
}
