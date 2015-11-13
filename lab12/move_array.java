//George Cooper
//CSE 002
//11/13/15


import java.util.Scanner;
public class move_array
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int mover = 0;
        
        
        //Creating and initializing the array.
        System.out.println("Please enter a value for the size of the array:");
        int arraySize = myScanner.nextInt();
        int[] myArray = new int[arraySize];
        
        try {
            myArray[arraySize-1] = 0;
        }
            catch (Exception e) {System.out.println("That array is too small! Terminating program..."); System.exit(0);}
        
        
        
        //Populating the array:
        System.out.print("The original array is: ");
        for (int i = 0; i < arraySize; i++)
        {
            myArray[i] = (int)(Math.random()*101);
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        
        
        System.out.println("Please enter an index:");
        int index = myScanner.nextInt();
        try {
            mover = myArray[index];
        }
            catch (Exception e) {System.out.println("That value is not in the array! Terminating program..."); System.exit(0);}
            
            
        for (int i = index; i < arraySize -1; i++)
        {
            myArray[i] = myArray[i+1];
        }
        myArray[arraySize-1] = mover;
        System.out.print("The new array is: ");
        for (int i = 0; i < arraySize; i++)
        {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
    }
}