//George cooper
//9/11/15
//CSE 002
//Lab03
//
//
//
//
// The purpose of this program is to calculate the amount each person must pay for a dinner.
// The program will ask the user to input the cost of the bill, the tip amount and the number of people.
// It will then calculate, including tip, how much each person is resposible for paying.
//
//
//
//
//  First we import the scanner class:
import java.util.Scanner;
//
//
//
//
//  Next we declare the class
public class Check{
//
//
//
//
// Declaring the main method:
public static void main(String[] args){

//Declaring the scanner object:
Scanner myScanner = new Scanner(System.in);                                     //This declares a scanner that accepts input from the computer.
//
//
//
//
//Here we declare variables necessary for the program
double checkCost, totalCost, costPerPerson;                                     //These doubles are directly related to the cost of the bill
int nPeople, tipPercent;                                                        //These integers are important for determining how the bill is split and the final cost, respectively
int dollars, dimes, pennies;                                                    //These integers are used to truncate the final cost to the hundreths place, because that is the value that makes sense to humans.
//
//
//
//
//Here we prompt the user to give us the necessary values:
System.out.println("Please input the cost of the bill in the form xx.xx.");     //This simply prints a line telling the user what to do.
checkCost=myScanner.nextDouble();                                               //This takes the next double that the user prints, and assigns it to checkCost
System.out.println("Please input the tip as a whole number");                   //This simply prints a line telling the user what to do.
tipPercent=myScanner.nextInt();                                                 //This takes the next integer the user prints, and assigns it to tipPercent
System.out.println("How many people are splitting the bill?");                  //This simply prints a line telling the user what to do.
nPeople=myScanner.nextInt();                                                    //This takes the next integer the user prints, and assigns it to nPeople
//
//
//
//
//Here we do the necessary calculations
totalCost=checkCost*(1+tipPercent/100.0);                                       //This determines the total cost by multiplying the check cost by 1+tip.
costPerPerson=totalCost/nPeople;                                                //This determines how much each person has to pay by dividing the cost by the number of people
dollars=(int)costPerPerson;                                                     //This casts each persons cost as an integer to determine the number of dollars to pay.
dimes=(int)(costPerPerson*10)%10;                                               //This determines the number of dimes by multiplying by 10, casting as an integer and getting the remainder when dividing by 10.  This returns the value in the .x position.
pennies=(int)(costPerPerson*100)%10;                                            //This determines the number of pennies by multiplying by 100, casting as an integer and getting the remainder when dividing by 10.  This returns the value in the .0x position.
//
//
//
//
//Here we print the final output:
System.out.println("Each person in the group owes: $"+dollars+'.'+dimes+pennies);  //This outputs how much each person must pay.
    }
}