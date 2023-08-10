/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EHAN
 */
class Staff
{
   int sid;
   String sname;
 
 public void write()
 {
     System.out.print("Staff id is "+sid);
     System.out.print("Name is "+sname);
 }
}
class Student
{
 int rno; //instance variable(they belongs to objects)
 static String name; // static varible
 public void read(int r, String n)
 {
     int age=18;// age is a local variable
     rno=r;
     name=n;
     System.out.println("Age is "+age);
 }
 
 public void write()
 {
     System.out.println("Number is "+rno);
     System.out.print("Name is "+name);
 }
}
public class BuildingBlocks
{
    public static void main(String args[])
    {
        Student s1=new Student();
        
        s1.read(14,"Sai Koushik");
        s1.write();
    }
}   