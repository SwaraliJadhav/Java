import java.util.*;
class CurvedSurfaceAreaOfCube
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double s,a;
        System.out.println("Enter the side of cube");
        s = sc.nextDouble();
        a = 4*s*s;
        System.out.println("Curved Surface area of cube="+a);
    }
}