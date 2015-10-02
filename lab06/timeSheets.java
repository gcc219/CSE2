//George Cooper
//October 2nd, 2015
//CSE 002
//
//
//
//  The purpose of this program is to calculate the total amount an employer needs to pay all employees.
//  It will first ask for the number of employees, and then it will ask for the hourly pay, number of hours, and number of days/week.
//  Then, it will calculate the total pay.
//
//
//
//  Here we import the scanner class:
import java.util.Scanner;



//  Here we declare the class
public class timeSheets
{



//  Here we declare the main method:
    public static void main(String[] args)
    {
        //First we have to declare the variable employees and initiate the scanner.
        int employees;
        double totalPay = 0;
        Scanner myScanner = new Scanner(System.in);
        
        
        
        //Next we must prompt the user to input the number of employees:
        System.out.print("Please enter the number of employees you have: ");
        employees = myScanner.nextInt();
        
        
        
        //Here we use a for loop so we can calculate pay for each individual employee:
        for (int i=0; i<employees; i++)
        {
            //First we declare all the variables we need in the for loop
            int days = 0;
            double hourlyPay = 0;
            double weeklyPay = 0;
            //Here we prompt the user for the number of days the employee works and his hourly pay:
            System.out.print("How many days does employee " + (i+1) + " work? ");
            days = myScanner.nextInt();
            System.out.print("How much does he make per hour? ");
            hourlyPay = myScanner.nextDouble();
            
            
            
            //Here we use a nested for loop to ask how many hours the employee worked each day:
            for (int j=0; j<days; j++)
            {
                int hours = 0;
                
                
                //Here we prompt the user to tell us how many hours the employee worked
                System.out.print("How many hours did this employee work on day " + (j+1) + "? ");
                hours = myScanner.nextInt();
                
                
                
                //Here we increase the weekly pay by the hours times pay per hour for each day
                weeklyPay = weeklyPay + hours*hourlyPay;
            }
            //Here we increase the totalPay by the weekly pay for each employee:
            totalPay = totalPay + weeklyPay;
            
            
        }
        //Here we print the totalPay
        System.out.println("You have to pay your employees a total of: " + totalPay + ".");
    }
}