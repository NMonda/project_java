import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {


            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
            double z = (double) x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by ZERO! Idiot");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number ayee!!!");
        } catch (Exception e) {
            System.out.println("Incorrect input! Please enter correct values ");
        }
        //System.out.println("This will always print");

    }
}

