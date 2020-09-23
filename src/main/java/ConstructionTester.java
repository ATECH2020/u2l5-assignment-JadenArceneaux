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
        
        Construction myConstruction = new Construction();

    }
}
