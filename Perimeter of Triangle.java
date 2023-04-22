import java.util.*;
class PerimeterOfTriangle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double a,b,c,p;
        System.out.println("Enter the sides of triangle");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = a+b+c;
        System.out.println("Perimeter of Triangle="+p);
    }
}