package main.java.com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainTest
{
    public static void main(String[] args)
    {
        Student s1=new Student(101,"Fanny",22);
        Student s2=new Student(105,"Fanny",22);
        Student s3=new Student(102,"Salena",22);
        Student s4=new Student(111,"Aldous",20);
        Student s5=new Student(109,"Kagura",17);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Collections.sort(studentList,new StudentSorter());
        Iterator<Student> itr=studentList.iterator();
        while(itr.hasNext())
            System.out.println(itr.next().toString()+  " ");

    }
}
