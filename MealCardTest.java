/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealcardtest;

import static java.lang.System.in;
import java.util.Scanner;
import myutility.Studentclass;//using another class from another package
import myutility.MealCard;    

  

/**
 *
 * @author 18062
 */
public class MealCardTest
{
String StudentAddress,StudentName;
    /**
     * @param args the command line arguments
     */
    char y;
    int c;
    double d;
    
    public static void main(String[] args) {
    int n=0;    
     while (n==0)
     {
          // import the other class
      char response = 'y';
        
     Studentclass myObj= new Studentclass();
     MealCard mypoint=new MealCard();
     Scanner user_input=new Scanner(System.in);
     System.out.println("Enter Student Identification number (4 digits):");
     String k =user_input.nextLine(); 
     //System.out.println("Enter Student Address:");
     //String b =user_input.nextLine();
     //System.out.println("Enter Student Age:");
     //  int c = user_input.nextInt();
      // myObj.setStudentAddress(b);
       myObj.setStudentName(k);
     //  myObj.setStudentage(c);
  
        System.out.println("Student Identification Nummber:\n"+myObj.getStudentName());
        //System.out.println("Student Address: "+myObj.getStudentAddress());
        //System.out.println("Student age: "+myObj.getStudentage());
        
        System.out.println("Would you like to set your points?(Y/n)? ");
      response = user_input.next().charAt(0);
      
       if (response=='Y'||response=='y')
     {
     System.out.println("Awesome how much would you like to add?");
     double d = user_input.nextInt();
     mypoint.Mealplan(d);
     }
       else 
       {
           System.out.println("You have been assigned a initial value of 100$");
           double d=100;
           mypoint.Mealplan(d);
       }
        
       System.out.println("\nWould you like to continue with another student?");
           response = user_input.next().charAt(0);
           if(response =='n'||response=='n')
           {
              System.out.println("Have a great Day!");
              n=1;
           }
           
     } 
        // TODO code application logic here
    }
    
}
