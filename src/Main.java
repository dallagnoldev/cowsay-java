import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("cowsay ");
        String cowsay = sc.nextLine();

        System.out.print("  ");
        for (int i = 0; i < cowsay.length(); i++) {
            System.out.print("-");
        }

        System.out.println("\n< " + cowsay + " >");

        System.out.print("  ");
        for (int i = 0; i < cowsay.length(); i++) {
            System.out.print("-");
        }

        System.out.println("\n   \\   ^__^   ");
        System.out.println("    \\  (oo)\\" + "______");
        System.out.println("       (__)\\       )\\/\\");
        System.out.println("           ||----w |");
        System.out.println("           ||     ||");

        sc.close();
    }
}