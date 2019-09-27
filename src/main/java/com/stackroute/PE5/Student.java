package main.java.com.stackroute.PE5;

import java.util.Comparator;

public class Student
{
    private  int id;
    private String name;
    private int age;

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

}
class StudentSorter implements Comparator<Student>
{

    @Override
    public int compare(Student student, Student t1)
    {
        if (student.getAge() == t1.getAge())
        {
            if (student.getName().equals(t1.getName()))
                return t1.getId() - student.getId();
            else
                return t1.getName().compareTo(student.getName());
        } else
            {
            return t1.getAge() - student.getAge();
            }
    }

}
