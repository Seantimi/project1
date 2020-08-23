// Program Lab1B
// Demonstrate using a string from the user.
import java.util.Scanner;
public class Lab1B {
// Reads a character string form the User and prints it.
public static void main (String[] args) {
String message;
Scanner scan = new Scanner (System.in);
System.out.print ("Enter a line of text:");
message = scan.nextLine();
System.out.println ("You entered: \"" + message + "\"");
}
}