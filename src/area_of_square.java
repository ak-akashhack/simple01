import java.util.Scanner;

public class area_of_square {
    public static void main(String[] args) {
        System.out.print("enter the side : ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area ;
        area = side * side ;
        System.out.println("Area of the Square is : " + area);
    }
}
