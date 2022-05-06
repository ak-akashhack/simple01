import java.util.Scanner;

public class java01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int x = sc.nextInt();
        System.out.print("enter the pawar of first number : ");
        int n = sc.nextInt();
        int m = x;
        for (int i=1; i<n; i++){
            x = m * x ;
        }
        System.out.println(x);
    
    }
}
