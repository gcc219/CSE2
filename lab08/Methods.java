//George Cooper
//CSE 002
//October 16th, 2015



// Here we import the scanner:
import java.util.Scanner;



public class Methods
{



public static void main(String[] args)

{
    //Here we declare necessary variables and the scanner.
    Scanner myScanner = new Scanner(System.in);
    double a, b, c, d, e, f, g, h, i, j;
    double mean, median;


    //Here we prompt the user to input the 10 numbers.
    System.out.print("Please enter number 1: ");
        a = myScanner.nextDouble();
    System.out.print("Please enter number 2: ");
        b = myScanner.nextDouble();
    System.out.print("Please enter number 3: ");
        c = myScanner.nextDouble();
    System.out.print("Please enter number 4: ");
        d = myScanner.nextDouble();
    System.out.print("Please enter number 5: ");
        e = myScanner.nextDouble();
    System.out.print("Please enter number 6: ");
        f = myScanner.nextDouble();
    System.out.print("Please enter number 7: ");
        g = myScanner.nextDouble();
    System.out.print("Please enter number 8: ");
        h = myScanner.nextDouble();
    System.out.print("Please enter number 9: ");
        i = myScanner.nextDouble();
    System.out.print("Please enter number 10: ");
        j = myScanner.nextDouble();



    //Here we call the three methods below to determine mean and median, then to print them.
    mean = meanMethod(a, b, c, d, e, f, g, h, i, j);
    median = medianMethod(a, b, c, d, e, f, g, h, i, j);
    printMethod(mean, median);
}



//This method determines the mean.  It adds the 10 numbers and divides by 10.
public static double meanMethod(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
{
    double sum = a + b + c + d + e + f + g + h + i + j;
    double average = sum/10;
    return average;
}



//This method determines the median.  It sorts the list, then takes the average of the middle 2 numbers as the mean.
public static double medianMethod(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
{
    double swap;
    double middle;
    
    
    while (!(a <= b && b <= c && c <= d && d <= e && e <= f && f <= g && g <= h && h <= i && i <= j))
    {
        
        if (a > b)
        {
        swap = a;
        a = b;
        b = swap;
        }
        
        if (b > c)
        {
        swap = b;
        b = c;
        c = swap;
        }
        
        if (c > d)
        {
        swap = c;
        c = d;
        d = swap;
        }
        
        if (d > e)
        {
        swap = d;
        d = e;
        e = swap;
        }
        
        if (e > f)
        {
        swap = e;
        e = f;
        f = swap;
        }
        
        if (f > g)
        {
        swap = f;
        f = g;
        g = swap;
        }
        
        if (g > h)
        {
        swap = g;
        g = h;
        h = swap;
        }
        
        if (h > i)
        {
        swap = h;
        h = i;
        i = swap;
        }
        
        if (i > j)
        {
        swap = i;
        i = j;
        j = swap;
        }
    }
    return middle = (e + f)/2;
}



//This method is passed the mean and median and then prints it.
public static void printMethod(double mean, double median)
{
System.out.println("The mean is: " + mean);
System.out.println("The median is: " + median);
}
}