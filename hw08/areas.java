//George Cooper
//hw08
//CSE 002
//10/25/15



//Here we import the scanner class:
import java.util.Scanner;

public class areas
{



public static void main(String[] args)
{
    //Here we declare all necessary variables and initialize the scanner:
    Scanner myScanner = new Scanner(System.in);
    String shape;
    int dimension1, dimension2, dimension3;
    int counter = 0;
    
    
    
    //Here we prompt the user to select a shape:
    
    
    
    while (counter == 0)
    {
        //Here we prompt the user to select a shape:
        System.out.println("Would you like to compute the area for a circle, rectangle, or trapezoid? (type 999 to quit)");
        shape = myScanner.next();
            //Here we use a switch statement so we can accept a different number of dimensions based on what shape the user wants the area of.
            switch (shape)
            {
            case ("circle"):
                {
                    //Here we prompt the user to input the dimension:
                    System.out.println("Ok, please enter the radius!");
                    //Here we assign that dimension to the respective variable:
                    dimension1 = myScanner.nextInt();
                    //Here we call the area function and pass it a single argument:
                    area(dimension1);
                    counter++;
                    break;
                }
            case ("rectangle"):
                {
                    System.out.println("Ok, please enter the height and width!");
                    dimension1 = myScanner.nextInt();
                    dimension2 = myScanner.nextInt();
                    area(dimension1, dimension2);
                    counter++;
                    break;
                }
            case ("trapezoid"):
                {
                    System.out.println("Ok, please enter the height and the two bases!");
                    dimension1 = myScanner.nextInt();
                    dimension2 = myScanner.nextInt();
                    dimension3 = myScanner.nextInt();
                    area(dimension1, dimension2, dimension3);
                    counter++;
                    break;
                }
            case ("999"):
                {
                    counter++;
                    break;
                }
            default:
                {
                    System.out.println("That's not a valid shape!");
                    break;
                }
            }
    }
}




//Here we declare our overloaded area methods:


//This one is for the circle, which only has 1 input:
public static void area(int radius)
{
    double area = radius*radius*Math.PI;
    area = area*100.0;
    area = (int)area;
    area = area/100.0;
    System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
}


//This one is for the rectangle, which has 2 inputs:
public static void area(int height, int width)
{
    int area = width*height;
    System.out.println("The area of a rectangle with height " + height + " and width " + width + " is " + area + ".");
}



//This one is for the trapezoid, which has 3 inputs:
public static void area(int height, int base1, int base2)
{
    int area = (base1+base2)/2*height;
    System.out.println("The area of a trapezoid with height " + height + ", and bases " + base1 + " and " + base2 + " is " + area + ".");
}
}