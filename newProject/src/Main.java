import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if(s.equals("Caleb")) {
            System.out.println("Hey Caleb");
        }
        else if (s.equals("Sally")){
            System.out.println("Hey Sally");
        }
        else {
            System.out.println("You're not welcome here");
        }

        scanner.close();
    }
}