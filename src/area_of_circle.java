import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        System.out.print("enter the redius : ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area ;
        area = pi * r * r ;
        System.out.println("Area of the circle is : " + area);

        System.out.println("end of the program : ");
    }
}
