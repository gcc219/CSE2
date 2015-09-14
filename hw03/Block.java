//George Cooper
//CSE 002
//September 15th, 2015
//
//
//
//
//  The purpose of this program is to calculate both the volume and surface area of a block.
//
//
//
//
//  The user will input the length, width and height of a block.
//  The program will then calculate volume and surface area.
//
//
//
//
//  Here we import the scanner
import java.util.Scanner;
//  Here we declare the class and main method
public class Block{

public static void main(String[] args) {
    
    

//Here we declare the necessary variables, and initialize the scanner:
double length, width, height;
Scanner myScanner= new Scanner(System.in);



//Here we prompt the user to enter the dimensions of the block:
 System.out.println("Please enter the length of the block: ");
 length=myScanner.nextDouble();
 System.out.println("Please enter the width of the block: ");
 width=myScanner.nextDouble();
 System.out.println("Please enter the height of the block: ");
 height=myScanner.nextDouble();
 
 
 
//Here we call the necessary methods:
 volume(length, width, height);
 surface(length, width, height);
 
}

public static void volume(double length, double width, double height){
double volume=length*width*height;
System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume);
}



//Here we create the surface area method:
public static void surface(double length, double width, double height){
double surface=((2*length*width)+(2*height*width)+(2*length*height));
System.out.println("And the surface area is: "+surface);
}
}