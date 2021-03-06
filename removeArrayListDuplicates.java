/*
Prompts the user to enter 10 integers to a list and displays the distinct
integers in their input order and separated by exactly one space.
*/

package javaapplication2;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        //prompt user entry
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++)
        {
            list.add(input.nextInt());
        }
        
        removeDuplicate(list);  //calls method to filter list
        System.out.print("The distinct integers are: ");
        
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");    //print element one by one
        }
        System.out.println();
    }
    
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        
        for(int i = 0; i < list.size(); i++)
        {
            if(newList.contains(list.get(i)) == false)  //if the new array already contains the value at the index
                newList.add(list.get(i));
        }
        
        list.clear();   //empties the arraylist
        
        for(int i = 0; i < newList.size(); i++)
        {
            list.add(newList.get(i));   //adds the distinct numbers one by one
        }
    }
}
