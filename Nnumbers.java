import java.util.Scanner;

public class Nnumbers
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = number*(number+1)/2;

        System.out.println(n);


    }
}
