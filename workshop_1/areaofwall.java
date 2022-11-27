import java.util.*;
public class areaofwall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length breadth and height");
        float l = input.nextFloat();
        float b = input.nextFloat();
        float h = input.nextFloat();
        input.close();
        float area = 2*(l*b)*h;
        System.out.println("The area of rectanglet" +area) ;
    }
}
