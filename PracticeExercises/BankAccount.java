//George Cooper
//Practice 2

public class BankAccount{
    
public static void main(String[] args){
    
    //declaring variables
    float bal;
    float r;
    float interest;
    int newint;
    float newbal;
    
    //assigning variables
    bal=100f;
    r=0.07f;
    interest=r*bal;
    newint=Math.round(interest);
    newbal=bal + newint;
    
    //printing output
    System.out.println("The new balance is:" + newbal);
}

}