// Program Lab1C
// Demonstrate the use of java class to read numeric data.
import java.util.Scanner;
public class Lab1C {
// Calculate fuel efficiency based on values entered by the user.
public static void main (String[] args) {
int miles;
double gallons, mpg;
Scanner scan = new Scanner (System.in);
System.out.print ("Enter the number of miles: ");
miles = scan.nextInt();
System.out.print ("Enter the gallon of fuel used: ");
gallons = scan.nextDouble ();
mpg = miles * gallons;
System.out.println ("Miles per Gallon: " + mpg);
}
}