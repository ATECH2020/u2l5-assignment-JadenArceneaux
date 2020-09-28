import java.util.Scanner;

public class HowFarAway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // declare new scanner

        // Get starting location
        System.out.print("Enter the latitude of the starting location: ");
        double startLatitude = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double startLongitude = scanner.nextDouble();

        // Get ending location
        System.out.print("Enter the latitude of the ending location: ");
        double endLatitude = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLongitude = scanner.nextDouble();

        scanner.close(); // close scanner

        GeoLocation myGL1 = new GeoLocation(startLatitude, startLongitude); // create location 1
        GeoLocation myGL2 = new GeoLocation(endLatitude, endLongitude); // create location 2

        System.out.println("The distance is " + myGL1.distanceFrom(myGL2)); // output distance

    }
}