/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EHAN
 */
public class StringsDemo {
    public static void main(String[] args) 
	  {
		 String s1=new String("ahil"); //108-76=32
		 String s2="EHAn";
                 String s5=" Sandur Polytechnic  ";
		 int s3=123;
	 	 System.out.println("DEMO OF STRING CLASS METHODS");	
		 System.out.println("the string in upper case  "+s1.toUpperCase());
		 System.out.println("the string in lower case  "+s2.toLowerCase());
		 System.out.println("the length of string s1 is  "+s1.length());
		 System.out.println("the index of 'a' in string "+s2 +" "+s2.indexOf('A'));
                 System.out.println("String after replacing "+s2 +" "+s5.replace(' ','_'));
                 System.out.println("Character at given position is  "+s2.charAt(2));
                 System.out.println("Sum of s3 and 10 is " +(s3+10));
		 System.out.println("Sum of s3 and 10 is "+(String.valueOf(s3)+10));
                 System.out.println("After trimming "+s5.trim());
		 String s4=s1.concat(s2);
		 System.out.println("the string s1 is concatenated with s2 "+s4);
		 //System.out.println(s1.compareTo(s2));
                 if(s1.compareTo(s2)==0)
			 System.out.println("EQUAL STRINGS");
		 else
			 System.out.println("UNEQUAL STRINGS"); 
	}
    
}

/*
1. 0
2.+ve
3.-ve
*/