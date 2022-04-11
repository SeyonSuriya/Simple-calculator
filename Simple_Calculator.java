import java.util.Scanner;

public class Simple_Calculator {

    //method for addition
    static void sum(int num1,int num2){
        int summ = num1 + num2;
        System.out.println("\nAnswer is " + summ);
    }

    //method for subraction
    static void diff(int num1,int num2){
        int difference = num1 - num2;
        System.out.println("\nAnswer is " + difference);
    }

    //method for multiplication
    static void multi(int num1,int num2){
        int product = num1 * num2;
        System.out.println("\nAnswer is " + product);
    }

    //method for division
    static void divide(int num1,int num2){
        float division = (float)num1/(float)num2;
        System.out.println("\nAnswer is " + division);
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Hello!..");
        System.out.println("What do you want to do?\n");
        
        System.out.println("Press number 1 for sum");
        System.out.println("Press number 2 for difference");
        System.out.println("Press number 3 for multiplication");
        System.out.println("Press number 4 for division\n");
        
        System.out.println("Press your option...");
        int option = input.nextInt();
        
        System.out.println("\nEnter number 1....");
        int number1 = input.nextInt();

        System.out.println("\nEnter number 2....");
        int number2 = input.nextInt();

        //using switch case to select operation method
        switch(option){
            case 1: sum(number1,number2);break;
            case 2: diff(number1,number2);break;
            case 3: multi(number1,number2);break;
            case 4: divide(number1,number2);break;
        }
        
        input.close();
    }
}
