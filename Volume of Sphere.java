import java.util.*;
class VolumeOfSphere
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        double r,v;
        System.out.println("Enter the radius of Sphere");
        r = sc.nextDouble();
        v = 4/3*(3.14*r*r*r);
        System.out.println("Volume of Sphere="+v);
    }
}