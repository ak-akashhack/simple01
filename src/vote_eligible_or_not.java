
// write a fuction that takes in age as input and returns if that person is
// eligible to vote or not. A person of age > 18 eligible to vote :

import java.util.Scanner;

public class vote_eligible_or_not {
    public static void vote(int age){

        if(age>=18){
            System.out.println("you are eligible for vote : ");
        }
        else {
            System.out.println("you are not eligible for vote : ");
        }

    }
    public static void main(String[] args) {
        System.out.print("enter the your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        vote(age);


    }
}
