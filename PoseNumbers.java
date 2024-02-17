import java.util.Scanner;

public class PoseNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        posorneg(x);
    }

    static void posorneg(int x)
    {

        if(x>=0){
            if(x==0)
            {
                System.out.println("Zero");
            }
            else {
                System.out.println("Positive");
            }
        }
        else{
            System.out.println("Negative");
        }
    }
}
