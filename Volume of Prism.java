import java.util.*;
class VolumeOfPrism 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double r,h,v;
        System.out.println("Enter the radius and height of cone");
        r = sc.nextDouble();
        h = sc.nextDouble();
        v = 3.14*r*r*h;
        System.out.println("Volume of Cone="+v);
    }
}