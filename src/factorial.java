import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("enter the any one number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=n;i++){

            factorial = factorial * i ;

        }
        System.out.println("Factorial of the given number is : " + factorial);

        System.out.println("end of the program : ");
    }
}
