import java.util.Scanner;

public class Credits {

    public void ShowCredits()
    {
        System.out.print("\033[H\033[2J");
        System.out.println("This program is created by BCBeno.");
        System.out.println("Created in 2023.");
        System.out.println();
        System.out.println("Press enter to continue...");
        try{
            System.in.read();
        }
        catch(Exception e) {
        }
    }
}
