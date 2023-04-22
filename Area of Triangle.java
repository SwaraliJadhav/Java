import java.util.*;
class AreaOfTriangle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double h,b,a;
        System.out.println("Enter the Height and Base of triangle");
        h = sc.nextDouble();
        b = sc.nextDouble();
        a = (b*h)/2;
        System.out.println("Area of Triangle="+a);
    }
}