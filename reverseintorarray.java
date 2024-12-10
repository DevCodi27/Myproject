public class reverseintorarray {

    public static void main(String[] args)
    {
        int a = reverse(234);
        System.out.println(a);

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] arr2 = new int[n];
        arr2 = reverse(arr);
        for(int i =0;i<n;i++)
        {
            System.out.print(arr2[i]+" ");
        }


    }

    static int reverse(int n)
    {
        int cnt = 0;
        int i = 0;
        int rem ,rev ,ans ;
        rem = rev = ans = 0;
        String num = Integer.toString(n);
        while(i<num.length())
        {

//        rem = n%10;
//        rev = rem+cnt;
//        ans = rev*10;
//        cnt = ans;
//        n = n/10;
//        i++;
            rev = rev*10+n%10;
            n = n/10;
            i++;
        }

        return rev;
    }
    static int[] reverse(int arr[])
    {
        int n = arr.length;
        int[] arr2 = new int [n];
        for(int i = n-1;i>=0;i--)
        {
            arr2[n-i-1]=arr[i];
        }
        return arr2;
    }
}
