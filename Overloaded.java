public class Overloaded {
   static int area(int l,int b)
    {
        int area = l*b;
        return area;
    }
    static double area(int r)
    {
        double area = 3.14*r*r;
        return area;
    }

    public static void main(String[] args)
    {
        int radius = 4;
        int length = 8;
        int breath = 10;

        double areaofcircle = area(radius);
        double areaofrectange = area(length,breath);
        System.out.println(areaofcircle);
        System.out.println(areaofrectange);
    }

}
