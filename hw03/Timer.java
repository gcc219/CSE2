//George Cooper
//CSE 002
//September 15th, 2015
//
//
//
//
//  The purpose of this program is to calculate the amount of a timer a user has before
//  a scheduled dinner with friends.
//
//
//  It will ask the user to input the current time, in military time.
//  Then it will ask the user to input the dinner time, in military time.
//  Then it will calculate the amount of time remaining until dinner.
//  It will do this by converting the times to a number of minutes, then subtract the two times and convert it back to xx hours xx minutes
//
//  Here we import the Scanner so we can accept keyboard input:
import java.util.Scanner;
    
//  Here we declare the class:
public class Timer {
    
//  Here we declare the main method:
public static void main(String[] args) {


//Here we declare the necessary variables and the scanner:
int currentTime, dinnerTime, timeRemaining, dHours, dMinutes, dBoth, cHours, cMinutes, cBoth, hoursLeft, minutesLeft;       //Note: d corresponds to dinner and c corresponds to current
Scanner time = new Scanner(System.in);



//Here we prompt the user to input the current time, then the dinner time
System.out.println("Please enter the current time in military time:");
    currentTime=time.nextInt();
System.out.println("Great, now enter the dinner time in military time:");
    dinnerTime=time.nextInt();



//Here we calculate the difference in time:

dHours=dinnerTime/100;              //Because the numbers are integers, this returns just the first two numbers, which correspond to hours in the HHMM format.
dMinutes=dinnerTime-dHours*100;     //This removes the hours that we already established to return just the last two numbers, which correspond to minutes.
dBoth=(dHours*60)+dMinutes;         //This converts the the number of hours to minutes and sums it with the number of minutes from before.

cHours=currentTime/100;             //This block of three lines does the same as above, but with the current time rather than the dinner time
cMinutes=currentTime-cHours*100;
cBoth=(cHours*60)+cMinutes;


timeRemaining=dBoth-cBoth;          //This returns the number of minutes remaining before dinner
hoursLeft=timeRemaining/60;         //This returns the number of whole hours that number of minutes corresponds to.
minutesLeft=timeRemaining%60;       //This returns the remainder from the previous division, which is the number of minutes.

//Here we output the time remaining:
System.out.println("You have "+hoursLeft+" hours and "+minutesLeft+" minutes until dinner.");
    

}
}