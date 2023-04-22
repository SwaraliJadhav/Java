import java.util.*;
class AreaOfParallelogram 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double h,b,a;
        System.out.println("Enter the Height and Base of Parallelogram");
        h = sc.nextDouble();
        b = sc.nextDouble();
        a = b*h;
        System.out.println("Area of Parallelogram="+a);
    }
}