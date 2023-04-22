import java.util.*;
class PerimeterOfRectangle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double l,b,p;
        System.out.println("Enter the length and breadth of Rectangle");
        l = sc.nextDouble();
        b = sc.nextDouble();
        p = 2*(l+b);
        System.out.println("Perimeter of Rectangle="+p);
    }
}