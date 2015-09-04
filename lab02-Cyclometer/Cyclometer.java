//George Cooper
//CSE 002
//September 4th, 2015
//
//
//
//
//  This program will give information on the time and distance of a given bicycle trip.
//  It will do four things:
//      1. Print the number of minutes a trip lasted
//      2. Print the number of counts for each trip
//      3. Print the distance of each trip in miles
//      4. Print the distance for the two combined trips
//
//
//Here we declare the class:
public class Cyclometer {
 
//Here we declare the main method:
public static void main(String[] args) {
    
//This is our input data:
int secsTrip1=480;          //This is the number of seconds trip 1 took.
int secsTrip2=3220;         //This is the number of seconds trip 2 took.
int rotationsTrip1=1561;    //This is the number of rotations of the front tyre in trip 1
int rotationsTrip2=9037;    //This is the number of rotations of the front tyre in trip 2

//These are essential constants necessary to make the calculations:
double wheelDiameter=27.0d, //This is the diameter of the wheel in inches, so we can convert rotations to distance
pi=3.14159,                 //This is the constant Pi, which is necessary for converting diameter to circumfrence
feetPerMile=5280,           //This is the number of feet in a mile, which we will convert to for the distance because miles are a more familiar unit of long distance
inchesPerFoot=12,           //This is the number of inches in a foot, which will be the first conversion when we convert from inches to miles
secondsPerMinute=60;        //This is the number of seconds in a minute, which we will convert to because minutes are a more familiar unit of time for longer periods
double distanceTrip1, distanceTrip2, distanceTotal;     //These values will store the distance for trips to simplify the calculation of the combined distance

//These are the outputs for tasks 1 and 2:
System.out.println("Trip 1 took " + secsTrip1/secondsPerMinute + " minutes, and had " + rotationsTrip1 + " tyre rotations.");
System.out.println("Trip 2 took " + secsTrip2/secondsPerMinute + " minutes, and had " + rotationsTrip2 + " tyre rotations.");

//These are the calculations for distance:
distanceTrip1=wheelDiameter*pi*rotationsTrip1;          //This gives the distance in inches
distanceTrip1=distanceTrip1/inchesPerFoot/feetPerMile;  //This converts the distance to miles
distanceTrip2=wheelDiameter*pi*rotationsTrip2;          //This gives distance in inches
distanceTrip2=distanceTrip2/inchesPerFoot/feetPerMile;  //This converts the distance to miles
distanceTotal=distanceTrip1+distanceTrip2;              //This stores the combined distance

//These are the outputs for tasks 3 and 4:
System.out.println("Trip 1 was " + distanceTrip1 + " miles long");  //This prints the first trip distance
System.out.println("Trip 2 was " + distanceTrip2 + " miles long");  //This prints the second trip distance
System.out.println("The two trips combined to be " + distanceTotal + " miles long");    //This prints the combined distance
    }
}
