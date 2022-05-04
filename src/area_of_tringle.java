import java.util.Scanner;

public class area_of_tringle {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("enter the height : ");
        float height = sc.nextInt();
        System.out.print("enter the base : ");
        float base = sc.nextInt();
        float area ;
        area = 0.5f * height * base ;

        System.out.println("Area of the tringle is : " + area);

    }
}
