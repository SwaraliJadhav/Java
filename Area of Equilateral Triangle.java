import java.util.*;
class AreaOfEquilateralTriangle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double s,a;
        System.out.println("Enter the Side of Equilateral Triangle");
        s = sc.nextDouble();
        a = (1.73*s*s)/4;
        System.out.println("Area of Equilateral Triangle="+a);
    }
}