public class Max {
    public static void main(String[] args)
    {
        System.out.println(max(40,50,70));
    }
    static int max(int ...A)
    {


        if(A.length==0)return Integer.MIN_VALUE;

        int max = A[0];

            for(int i =1;i<A.length;i++)
            {

                if(A[i]>max)
                {
                    max = A[i];
                }
            }

        return max;
    }

}
