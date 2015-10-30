//George Cooper
//CSE 002
//October 30, 2015


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        int n = 0;
        double average = 0;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many elements would you like your array to have?");
        n = myScanner.nextInt();
        int[] myArray = new int[n];
        
        
        
        //For loop for initializing the array with random values:
        for (int i = 0; i < n; i++)
        {
            myArray[i] = (int)(Math.random() * 101);
        }
        
        
        
        //For loop for printing the values in the array
        System.out.print("The values in the array are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(myArray[i] + " ");
            
        }
        System.out.println("");
        
        
        
        //For loop for summing elements and creating average
        for (int i = 0; i < n; i++)
        {
            sum = sum + myArray[i];
        }
        average = (double)sum/n;
        System.out.println("The average of the array is: " + average);
        
        
        
        //For loop for printing elements greater than average
        System.out.print("These values are above the average: ");
        for (int i = 0; i < n; i++)
        {
            if (myArray[i] >= average)
                System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
    }
}