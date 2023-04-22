import java.util.*;
class AreaOfRhombus 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double d1,d2,a;
        System.out.println("Enter the length of diagonals of Rhombus");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        a = (d1*d2)/2;
        System.out.println("Area of Rhombus="+a);
    }
}