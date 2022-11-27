import java.util.*;
public class tsaofsphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of sphere");
        int r = input.nextInt();
        double area = 4*3.14*r*r;
        System.out.println("The total surface area of sphere is " +area);
    }
    
}
