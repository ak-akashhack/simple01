
// Fibbonancci Series program

import java.util.Scanner;

public class fibonancciseries {

    public static void main(String[] args) {

        System.out.println("This is hacker : ");
        System.out.print("How many time type of fibbonanci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 ;
        System.out.println(n1 + "\n" + n2);

        for(int i=2;i<=n;i++){
            n3 = n1 + n2 ;
            System.out.println(n3);
            n1 = n2 ;
            n2 = n3 ;
        }


    }
}
