//George Cooper
//CSE 002
//November 6th,2015



public class Arrays
{
    public static void main(String[] args)
    {
        int[] myArray1 = new int[20];
        int[] myArray2 = new int[10];
        int[] myArray3 = new int[30];
        
        
        
        //For loop to initialize the first array:
        for (int i = 0; i < 20; i++)
        {
            myArray1[i] = (int)(Math.random()*100);
        }
        //For loop to initizlize the second array:
        for (int i = 0; i < 10; i++)
        {
            myArray2[i] = (int)(Math.random()*100);
        }
        //For loop to initialize the third array with the first 20 elements from myArray1 and the last 10 elements from myArray2
        for (int i = 0; i < 30; i++)
        {
            if (i < 20)
            {
                myArray3[i] = myArray1[i];
            }
            if (i >= 20)
            {
                myArray3[i] = myArray2[i-20];
            }
        }
        
        sort(myArray1);
        sort(myArray2);
        sort(myArray3);
        print(myArray1);
        System.out.println();
        print(myArray2);
        System.out.println();
        print(myArray3);


    }
    
    
    
    //Sorting method
    public static void sort(int[] array)
    {
        int length = array.length;
        int lowest;
        int location;
        //This for loop moves through the array sorting 1 element at a time.
        for (int i = 0; i < length; i++)
        {
            lowest = 101;
            location = 0;
            //This for loop moves through the remaining unsorted elements and finds the lowest
            for (int j = i; j < length; j++)
            {
               if (array[j] < lowest)
               {
                   lowest = array[j];
                   location = j;
               }
            }
            //Here we swap the lowest value in the array with the current value
            array[location] = array[i];
            array[i] = lowest;
        }
    }
    
    
    public static void print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
        System.out.println();
    }
    
}