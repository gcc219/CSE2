//George Cooper
//CSE 002
//Lab13

public class Rectangle {
//global variables:    
double width, height;

public static void main(String args[]) 
{
    //rectangle object and functions with the rectangle.
    Rectangle r1 = new Rectangle();
    r1.setHeight(5.3);
    r1.setWidth(7.3);
    System.out.println(r1.getArea());
}







//Rectangle functions:
public void setWidth(double x)
{
    width = x;
}
public void setHeight(double x)
{
    height = x;
}
public double getArea()
{
    return width*height;
}
}