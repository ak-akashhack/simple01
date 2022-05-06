import java.util.Scanner;

public class java02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number : ");
        int a = sc.nextInt();
//        int b = sc.nextInt();
        int i;
        for (i = 1 ; i<=a/2 ; i++){
            if(a%i==0){
//                System.out.println(i);
            }

        }
        i--;
        System.out.println(i);


    }
}
