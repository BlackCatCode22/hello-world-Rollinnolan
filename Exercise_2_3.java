import java.util.Scanner;
public class Exercise_2_3
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = stdin.nextLine();
        name = name.toUpperCase();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
