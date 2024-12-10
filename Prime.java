
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            PrimeorNot obj = new PrimeorNot();
            int result = obj.sampleMethod(number);

            if (result != -1) {
                if (result == 1) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
class PrimeorNot
{
    public int sampleMethod(int number)
    {
        // put your code here
        int cnt = 0;
        if(number == 0)
        {
            return -1;
        }
        for(int i =2 ;i<number/2;i++)
        {
            if(number%i==0)
            {
                cnt++;
            }
        }

        if(cnt == 0)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}

