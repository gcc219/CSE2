//George Cooper
//CSE 002
//September 8th, 2015
//
//
//
//
//  The purpose of this program is to calculate the cost of a trip to walmart,
//  including the Pennsylvania sale tax of 6%.
//
//
//  It will calculate the total cost of each item, then the sale tax for that item.
//  It will sum the cost of each item for the sub total.
//  Then it will apply the sales tax to the sub total for the true total.
//
//
//
//
//  Here we declare the class
public class Arithmetic {
    
//  Here we declare the main method
public static void main(String[] args) {


//Next we declare the variables needed for cost and number of each item.

//The number of pairs of socks:
int nSocks = 3;
//The cost of each pair of socks, in dollars:
double sockCost$=2.58;

//The number of drinking glasses:
int nGlasses=6;
//The cost of each glass, in dollars:
double glassCost$=2.29;

//The number of boxes of envelopes:
int nEnvelopes=1;
//The cost of each box of envelopes, in dollars:
double envelopeCost$=3.25;

//The PA state sales tax:
double taxPercent=0.06;



//Next we must declare other variables necessary for the calculations:
double totalSockCost, totalGlassesCost, totalEnvelopeCost; //Total cost for each item, pre tax.
double taxForSocks, taxForGlasses, taxForEnvelopes; //Tax for each item.
double totalCostNoTax; //Total for entire purchase, pre tax.
double totalCostWithTax; //Total for entire purchase with tax



//The calculations for total cost of each item.
totalSockCost=nSocks*sockCost$;             //Number of socks times price per sock.
totalGlassesCost=nGlasses*glassCost$;       //Number of glasses times price per glasses
totalEnvelopeCost=nEnvelopes*envelopeCost$; //Number of envelopes times price per envelope



//The calculations for each item's sales tax:
taxForSocks=totalSockCost*taxPercent;           //This sets taxForSocks equal to the cost times the tax percent, which is the value of the sales tax.
taxForGlasses=totalGlassesCost*taxPercent;      //This does the same thing for glasses.
taxForEnvelopes=totalEnvelopeCost*taxPercent;   //This does the same thing for envelopes.



//The total cost of the purchases before tax:
totalCostNoTax=totalSockCost+totalGlassesCost+totalEnvelopeCost;    //This sums the costs of each item before tax is applied.



//The total cost of the purchases after tax:
totalCostWithTax=totalCostNoTax+(totalCostNoTax*taxPercent);        //This first multiples the cost without tax by the tax percent to determine the value of the sales tax.  Then it adds that value to the pre-tax purchase to find the total.


//It doesn't make sense for the consumer to see a total value that is accurate to more than 2 decimal places, because paying that simply isn't possible.  So we will convert the sub total and total to a 2 decimal number.
totalCostNoTax*=100.0;  //Here the sub total is multiplied by 100 to get all relevant numbers on the left side of the decimal point.  This is effectively putting the price in terms of cents.
totalCostNoTax=Math.round(totalCostNoTax);  //Here the sub total is rounded to the nearest integer (which is really the nearest cent since we multipled by 100.)  The number could also have been casted as an integer, but truncating would be less advantageous than rounding to the seller, who is probably the person this program is written for.  Ultimately, rounding will generate more profits than truncating.
totalCostNoTax/=100.0;  //Here the sub total is divided by 100 to convert the sub total from cents to dollars.

//The same process occurs here with the total.
totalCostWithTax*=100.0;
totalCostWithTax=(Math.round(totalCostWithTax));
totalCostWithTax/=100.0;



//Displaying the output of the calculations:  (These lines simply tell the computer to output the information in a reader friendly manner.)
System.out.println("The total cost of " + nSocks + " socks at $" + sockCost$ + " is: $" + totalSockCost + ". With a sales tax of: $" + taxForSocks + ".");
System.out.println("The total cost of " + nGlasses + " glasses at $" + glassCost$ + " is: $" + totalGlassesCost + ". With a sales tax of: $" + taxForGlasses + ".");
System.out.println("The total cost of " + nEnvelopes + " envelope at $" + envelopeCost$ + " is: $" + totalEnvelopeCost + ". With a sales tax of: $" + taxForEnvelopes + ".");
System.out.println("The sub total of the purchase is $" + totalCostNoTax + ".");
System.out.println("The total of the purchase, with tax, is $" + totalCostWithTax + ".");
    }
}