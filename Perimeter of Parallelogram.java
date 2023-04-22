import java.util.*;
class PerimeterOfParallelogram 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double a,b,p;
        System.out.println("Enter the side and base of Parallelogram");
        a = sc.nextDouble();
        b = sc.nextDouble();
        p = 2*(a+b);
        System.out.println("Perimeter of Parallelogram="+p);
    }
}