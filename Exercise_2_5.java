import java.util.Scanner;
public class Exercise_2_5
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int dozen = 12;
        int gross = 144;
        System.out.println("How many eggs do you have?");

        int total = stdin.nextInt();
        int numGross = total/gross;
        total = total%gross;
        int numDozen = total/dozen;
        total = total%dozen;

        System.out.println("Your number of eggs is " + numGross + " gross, " + numDozen + " dozen, and " + total + " eggs.");
    }
}
