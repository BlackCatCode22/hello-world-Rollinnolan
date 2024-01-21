import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercise_2_7
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("C:\\Users\\Nolan\\IdeaProjects\\Hello World\\src\\testdata.txt");
        Scanner stdin = new Scanner(file);



        String name = stdin.nextLine();
        int exam1 = stdin.nextInt();
        int exam2 = stdin.nextInt();
        int exam3 = stdin.nextInt();
        double average = 100.00;
        average = (((double)exam1 + (double)exam2 + (double)exam3) / (double)3.00);
        System.out.println("The average grade of " + name + " was " + String.format("%.2f",(average)));
        /*may not show with different file pathway but the output stated "The average grade of Nolan Barrett was 91.67"*/
    }
}
