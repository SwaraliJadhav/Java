import java.util.*;
class AreaOfRectangle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double l,b,a;
        System.out.println("Enter the Length and Breadth of Rectangle");
        l = sc.nextDouble();
        b = sc.nextDouble();
        a = l*b;
        System.out.println("Area of Rectangle="+a);
    }
}