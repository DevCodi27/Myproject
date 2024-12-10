public class Alphabet {
    public static void charachter(char c)
    {
        if((c>='a' && c<='z')||(c>='A'&&c<='Z'))
        {
            System.out.println("This is an alphabet");
        }
        else {
            System.out.println("This is not a alphabet");
        }
    }
    public static void main(String[] args)
    {
        char c ='1';
        charachter(c);

    }
}
