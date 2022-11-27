import java.lang.Math;
public class areatriangle {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 4;
        double s = (a+b+c)/2;
        System.out.println(s);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle " +area);
    }

    
}
