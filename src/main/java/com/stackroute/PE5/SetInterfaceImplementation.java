package main.java.com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetInterfaceImplementation
{
    public static void main(String[] args)
    {
        TreeSet<String> elementList = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in a single line separated by space ");
        String[] str = sc.nextLine().split(" ");
        for (String s : str)
        {
            elementList.add(s);
        }

        ArrayList<String> al=new ArrayList<>(elementList);

        Iterator<String> itr = elementList.iterator();
        System.out.print("Sorted Set : ");
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");

        }
        Iterator<String> it=al.iterator();
        System.out.print("\nArray List for Set : ");
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");

        }
    }
}
