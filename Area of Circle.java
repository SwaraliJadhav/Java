import java.util.*;
class AreaOfCircle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double r,a;
        System.out.println("Enter radius");
        r = sc.nextDouble();
        a = 3.14*r*r;
        System.out.println("Area of circle="+a);
    }
}