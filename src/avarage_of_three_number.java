
// Enter three numbers the user & make a function to print their average :

import java.util.Scanner;

public class avarage_of_three_number {
    public static int average(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        System.out.println("enter the three number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average of the three number is : " + average(a,b,c));

        System.out.println("end of the program : ");
    }
}
