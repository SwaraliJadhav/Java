import java.util.*;
class PerimeterOfSquare 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double s,p;
        System.out.println("Enter the side of Square");
        s = sc.nextDouble();
        p = 4*s;
        System.out.println("Perimeter of Square="+p);
    }
}