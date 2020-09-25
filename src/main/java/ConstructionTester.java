import java.util.Scanner;

public class ConstructionTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the tax rate");
        double taxRate = scanner.nextDouble();

        System.out.println("How many boards do you need");
        int boards = scanner.nextInt();
        
        System.out.println("How many windows do you need");
        int windows = scanner.nextInt();
        
        scanner.close();

        Construction myConstruction = new Construction(8, 11, taxRate);
        double total = myConstruction.lumberCost(boards) + myConstruction.windowCost(windows);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + myConstruction.grandTotal(total));

    }
}
