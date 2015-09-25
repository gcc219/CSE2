//George Cooper
//CSE 002
// 9/18/15
//
//
//
//  The purpose of this program is to provide a user with a basic calculator.
//  It will ask the user for two integers and an operator: +,-,*,/.
//  It will then performe the calculation in the form (a (operator) b).
//
//
//
//  Here we import the scanner class:
import java.util.Scanner;
//  Here we create the class for the program:
public class CalculatorSpecial
{
//  Here we call the main method
    public static void main(String[] args)
    {
//  Here we declare necessary variables and initialize the scanner:
        double firstNumber, secondNumber, total;
        String stopper = "y";
        String operator;
        Scanner myScanner = new Scanner(System.in);     //This statement initializes a scanner called my scanner, and enables it to accept input from the user.
//
//
//
//  Here we use a while loop to allow the code to repeat itself:
        while ( !(stopper.equals("n") || stopper.equals("N")) )
        
        {
//
//
//
//  Here we ask the user to input the numbers and operator.
            System.out.println("What is the first number?");
            firstNumber = myScanner.nextDouble();                   //This statement assigns the number that the user inputs to the variable firstNumber.
            System.out.println("What is the second number?");
            secondNumber = myScanner.nextDouble();                  //This statement assigns the number that the user inputs to the variable secondNumber.
            System.out.println("What operator would you like to use (choose between +,-,*,/?");
            operator = myScanner.next();                            //This statement assigns the string that the user inputs to the variable operator.
//
//
//
//  Here we start the switch statement:
            switch (operator)                   //This tells the computer what to do for each of the 4 possible operators, and if the operator that was inputted isn't one of those for, it tells the user that it can't perform the operation.
            {
                case "+":                                               //This case assigns total the value of the sum, and then prints that out.
                    {
                        total=firstNumber+secondNumber;
                        System.out.println("The total is: " + total);
                        break;
                    }
                case "-":                                               //This case assigns total the value of the difference, and then prints that out.
                    {
                        total=firstNumber-secondNumber;
                        System.out.println("The total is: " + total);
                        break;
                    }
                case "*":                                               //This case assigns total the value of the multiplication, and then prints that out.
                    {
                        total=firstNumber*secondNumber;
                        System.out.println("The total is: " + total);
                        break;
                    }  
                case "/":                                               //This case assigns total the value of the division, and then prints that out.
                    {
                        total=firstNumber/secondNumber;
                        System.out.println("The total is: " + total);
                        break;
                    }
                default:                                                //This case prints out that the user did not select an appropriate operator.
                    {
                        System.out.println("Illegal Operator.");
                        break;
                    }
                
            }
// Here we ask the user if he wants to continue:
            System.out.println("Do you want to continue? Type n or N if not:");
            stopper = myScanner.next();
            
        }   
    }
}