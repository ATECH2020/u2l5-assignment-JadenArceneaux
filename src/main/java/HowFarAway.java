import java.util.Scanner;

public class HowFarAway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double startLatitude = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double startLongitude = scanner.nextDouble();

        System.out.print("Enter the latitude of the ending location: ");
        double endLatitude = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLongitude = scanner.nextDouble();

    }
}