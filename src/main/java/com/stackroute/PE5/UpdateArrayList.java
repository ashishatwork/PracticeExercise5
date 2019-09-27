package main.java.com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UpdateArrayList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);int enter=1;
        ArrayList<String> list=new ArrayList<String>();
        do {
            System.out.println("Want to add element? Enter :");
            System.out.println("\n 0: No \n 1:Yes \n 2:Remove element \n 3:Print array \n 4:Clear whole array");
            enter=sc.nextInt();
            switch(enter)
            {
                case 0: enter=0;
                        break;
                case 1:System.out.println("Enter element :");
                        sc.nextLine();
                        String str=sc.nextLine();
                        list.add(str);
                        break;
                case 2:
                        System.out.println("Enter index you want to remove element from");
                        int index=sc.nextInt();
                        list.remove(index);
                        break;

                case 3:Iterator<String> itr=list.iterator();
                        System.out.println("List Elements :");
                        while(itr.hasNext())
                            System.out.print(itr.next()+  " ");
                        System.out.println("\n");
                        break;
                case 4: list.clear();
                        break;
            }

        }while(enter!=0);

    }
}
