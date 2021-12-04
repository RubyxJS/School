import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner consoleIo = new Scanner(System.in);

        System.out.println("Please input volume, mass and density");
        System.out.println("Volume:");
        double volume = consoleIo.nextInt();
        System.out.println("Mass:");
        double mass = consoleIo.nextInt();
        System.out.println("Density:");
        double density = consoleIo.nextInt();

        while(true){
        System.out.println("For calculating volume press 1");
        System.out.println("For calculating mass press 2");
        System.out.println("For calculating density press 3");
        System.out.println("To end program enter 4 ");

        int choice = consoleIo.nextInt();

            if(choice <= 0){
                System.out.println("Invalid input");
            } else if(choice >= 5) {
                System.out.println("Invalid input");
            } else if(choice == 4) {
                break;
            } else if (choice == 1) {
                double answer = mass/density;
                System.out.println("The Volume is: 34" + answer);
            }else if(choice == 2){
                double answer = density*volume;
                System.out.println("The Mass is: 22");
            }else if(choice == 3){
                double answer = mass/volume;
                System.out.println("The Density is " + answer);
            }
        }
    }
}