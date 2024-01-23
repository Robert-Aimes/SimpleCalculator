import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your first number:");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("Please provide your second number:");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("What operation would you like to perform?\n+\n-\n*\n/");
        String operation = scanner.nextLine();

        double result = compute(firstNumber, secondNumber, operation);
        System.out.println("Result: " + result);


    }

    //Method for addition
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    //Method for subtraction
    public static int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    //Method for multiplication
    public static int multiply(int a, int b){
        int result = a * b;
        return result;
    }

    //Method for division
    public static double divide(int a, int b){
        if(b==0){
            System.out.println("Cannot divide by 0");
            return 0;
        }
        int result = a / b;
        return result;

    }


    //Method for computing the two given numbers
    public static double compute(int a, int b, String operation){
        if(operation.equals("+")){
            return add(a,b);
        } else if(operation.equals("-")){
            return subtract(a,b);
        } else if(operation.equals("*")){
            return multiply(a,b);
        } else if(operation.equals("/")){
            return divide(a,b);
        }
        return 0;
    }

}
