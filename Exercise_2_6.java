import java.util.Scanner;
public class Exercise_2_6
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter your first and last name separated by a space");
        String input = stdin.nextLine();

        int space = input.indexOf(' ');
        String firstName = input.substring(0,space);
        String lastName = input.substring(space);
        lastName = lastName.trim();
        String initials = firstName.substring(0,1) + lastName.substring(0,1);

        System.out.println("Your first name is " + firstName + ", which has "+ firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters.");
        System.out.println("Your initials are " + initials);
    }
}
