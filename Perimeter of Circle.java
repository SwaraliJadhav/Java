import java.util.*;
class PerimeterOfCircle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double r,p;
        System.out.println("Enter radius");
        r = sc.nextDouble();
        p = 2*3.14*r;
        System.out.println("Perimeter of circle="+p);
    }
}