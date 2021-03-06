/*
Prompts the user to enter two lists, each with five integers, and displays their
union. The numbers are separated by exactly one space.
*/

package javaapplication3;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //prompt user entry for list1
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter 5 integers for list1: ");
        for(int i = 0; i < 5; i++)
        {
            list1.add(input.nextInt());
        }
        
        //prompt user entry for list2
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter 5 integers for list2: ");
        for(int i = 0; i < 5; i++)
        {
            list2.add(input.nextInt());
        }
        
        //assigns values of combined list to new arraylist
        ArrayList<Integer> newList = union(list1, list2);
        
        System.out.print("The combined list is ");
        for(int i = 0; i < newList.size(); i++)
        {
            System.out.print(newList.get(i) + " ");
        }
        System.out.println();
    }
    
    public static ArrayList union(ArrayList list1, ArrayList list2)
    {
        for(int i = 0; i < list2.size(); i++)
        {
            list1.add(list2.get(i));    //adds values of list2 to the end of list1
        }
        return list1;
    }
}
