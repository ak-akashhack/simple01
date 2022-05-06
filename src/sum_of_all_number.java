
// write a function to print the usm of all odd numbers from 1 t0 n :

import java.util.Scanner;

public class sum_of_all_number {
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++){
            if(i%2==1){
                System.out.print(i + "\t");
            }
        }

    }
}
