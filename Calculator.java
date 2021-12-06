import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // creat scanner for inputing values from the console
        Scanner consoleIo = new Scanner(System.in);

        // loops the program if a condition is met
        while (true) {
            // asks the user what they would like to do
            System.out.println("For calculating volume press 1");
            System.out.println("For calculating mass press 2");
            System.out.println("For calculating density press 3");
            System.out.println("To end program enter 4 ");
            int choice = consoleIo.nextInt();

            // Performs different actions depending on the "choice" value
            if (choice <= 0) {
                System.out.println("Invalid input");
            } else if (choice >= 5) {
                System.out.println("Invalid input");
            } else if (choice == 4) {
                break;
                
            } else if (choice == 1) {
                System.out.println("Please input mass and density");
                System.out.println("Density:");
                double density = consoleIo.nextInt();
                System.out.println("Mass:");
                double mass = consoleIo.nextInt();
                double answer = mass / density;
                System.out.println("The Volume is: " + answer);

            } else if (choice == 2) {
                System.out.println("Please input volume and density");
                System.out.println("Density:");
                double density = consoleIo.nextInt();
                System.out.println("Volume:");
                double volume = consoleIo.nextInt();
                double answer = density * volume;
                System.out.println("The Mass is: " + answer);

            } else if (choice == 3) {
                System.out.println("Please input mass and volume");
                System.out.println("Volume:");
                double volume = consoleIo.nextInt();
                System.out.println("Mass:");
                double mass = consoleIo.nextInt();
                double answer = mass / volume;
                System.out.println("The Density is " + answer);
            }
        }
    }
}