package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("How old are you? (in number)");
        int age = Integer.parseInt(sc.nextLine());

        if(age<13){
            System.out.println("Sorry, you should be 13 years or older to use this program");
            System.exit(0);
        }

        System.out.println("What city are you living in?");
        String city = sc.nextLine();

        System.out.println("What are you interested in?");
        String interest = sc.nextLine();

        System.out.println("Here is your summary \n-----------------\n");
        System.out.printf("My name is %s \n", name);
        System.out.printf("I am %s years old currently living in %s \n", age, city);
        System.out.println("I am interested in " + interest +". Nice to meet you!");
    }


}
