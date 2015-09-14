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
//
//  Here we import the Scanner so we can accept keyboard input:
import java.util.Scanner;
    
//  Here we declare the class:
public class Timer {
    
//  Here we declare the main method:
public static void main(String[] args) {


//Here we declare the necessary variables and the scanner:
int currentTime, dinnerTime, timeremaining, hours, minutes;
Scanner time = new Scanner(System.in);



//Here we prompt the user to input the current time, then the dinner time
System.out.println("Please enter the current time in military time:");
    currentTime=time.nextInt();
System.out.println("Great, now enter the dinner time in military time:");
    dinnerTime=time.nextInt();



//Here we calculate the difference in time:
timeremaining=dinnerTime-currentTime;
hours=timeremaining/100;
minutes=timeremaining-(100*hours);



//This while loop improves the user experience by insuring that the minutes value
//will not be greater than 60.  It simplifies the time remaining.
while (minutes>60){
    hours++;
    minutes=minutes-60;
}



//Here we output the time remaining:
System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner.");
    
    
}
}