import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> fruitBasket = new Stack<>();

        System.out.print("Enter the number of fruits you would like to catch: ");
        int numberOfFruits = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose your fruits:");
        System.out.println("Press A for Apple, O for Orange, M for Mango, G for Guava.");

        while (numberOfFruits > 0) {
            System.out.print("Enter fruit choice: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "A":
                case "APPLE":
                    fruitBasket.push("Apple");
                    break;
                case "O":
                case "ORANGE":
                    fruitBasket.push("Orange");
                    break;
                case "M":
                case "MANGO":
                    fruitBasket.push("Mango");
                    break;
                case "G":
                case "GUAVA":
                    fruitBasket.push("Guava");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose A, O, M, or G.");
                    continue;
            }

            numberOfFruits--;
            System.out.println("Current fruits in the basket: " + fruitBasket);
        }

        System.out.println("You have caught all the fruits you wanted!");

        while (!fruitBasket.isEmpty()) {
            System.out.print("Press E to display remaining fruits: ");
            String command = scanner.nextLine().toUpperCase();

            if (command.equals("E")) {
                if (!fruitBasket.isEmpty()) {
                    System.out.println("Fruits remaining in the basket: " + fruitBasket);
                    fruitBasket.pop();
                } else {
                    System.out.println("No more fruits.");
                }
            } else {
                System.out.println("Invalid command. Please press E.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the FruitBasket program!");
    }
}