
// write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class who_is_big {
    public static int Greater(int a,int b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        System.out.println("enter the two number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("this value is the big value : " + Greater(a,b));
    }
}
