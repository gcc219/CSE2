//George Cooper
//September 28th, 2015
//CSE 002
//
//
//
//  The purpose of this program is to calculate a students average grade based on inputs from the student.
//  It will continuously accept grades from the student until 999 is typed.
//  When 999 is typed, the program will stop accepting new data and will calculate the average.
//
//
//
//  Here we import the scanner class:
import java.util.Scanner;



//  Here we declare the class
public class averageGrade
{



//  Here we declare the main method:
    public static void main(String[] args)
    {
// Here we initialize necessary variables and declare the scanner:
        int numberOfGrades=0;
        int totalGrade=0;
        int individualGrade;
        double average;
        Scanner myScanner = new Scanner(System.in);
        
        
        
//Here we create a do while loop:
        do
        {
//  Here we prompt the user to input a grade, and accept it with the scanner:
            System.out.println("Please enter a grade or enter 999 to calculate the average");
            individualGrade = myScanner.nextInt();
            
            
//  This conditional statement ensures that only valid grades (0-100) can be used.
            if (individualGrade>=0 && individualGrade<=100)
            {
                totalGrade = totalGrade + individualGrade;  //This increases the total grade by the individual grade
                numberOfGrades++;                           //This increments the number of grades by 1
            }



//  This else if statement tells the user when a grade is invalid
            else if (individualGrade != 999)
            {
                System.out.println("That's not a valid grade!");
            }
        }
        
        
        
//This tells the computer when to exit the do while loop
        while (individualGrade != 999);
        average = (double)totalGrade/numberOfGrades;        //This calculates the average
        System.out.println("Your average is " + average);   //This prints the average
    }
}