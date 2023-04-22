import java.util.*;
class PerimeterOfRhombus 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double s,p;
        System.out.println("Enter the side of Rhombus");
        s = sc.nextDouble();
        p = 4*s;
        System.out.println("Perimeter of Rhombus="+p);
    }
}