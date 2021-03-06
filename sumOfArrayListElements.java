/*
Prompts the user to enter five numbers, stores them in an array list, and
displays their sum.
*/

package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        //prompts user entry
        System.out.print("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++)
        {
            list.add(input.nextDouble());
        }
        
        System.out.println("The sum of the list is " + sum(list));
    }   
    
    public static double sum(ArrayList<Double> list)
    {
        double sum = 0; //sum initialized to 0
        for(int i = 0; i < list.size(); i++)
        {
            sum += list.get(i); //add each element one by one from the list
        }
        return sum;
    }
}
