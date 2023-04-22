import java.util.*;
class TotalSurfaceAreaOfCylinder
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double r,h,a;
        System.out.println("Enter the radius and height of cube");
        r = sc.nextDouble();
        h = sc.nextDouble();
        a = 2*3.14*r*(r+h);
        System.out.println("Total Surface Area of Cylinder="+a);
    }
}