import java.math.*;
import java.util.Scanner;
public class Exercise_2_4
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        double penny = 0.01;
        int numberOfPennies;
        double nickel = 0.05;
        int numberOfNickels;
        double dime = 0.1;
        int numberOfDimes;
        double quarter = 0.25;
        int numberOfQuarters;

        System.out.println("I am here to help you count your change.");
        System.out.println("How many Quarters do you have?");
        numberOfQuarters = stdin.nextInt();
        System.out.println("How many Dimes do you have?");
        numberOfDimes = stdin.nextInt();
        System.out.println("How many Nickels do you have?");
        numberOfNickels = stdin.nextInt();
        System.out.println("How many Pennies do you have?");
        numberOfPennies = stdin.nextInt();
        double result = (double)numberOfQuarters * quarter + (double)numberOfDimes * dime + (double)numberOfNickels * nickel + (double)numberOfPennies * penny;
        System.out.println("You have $" + result);
    }
}
