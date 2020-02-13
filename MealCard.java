/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutility;
import java.util.Scanner;
/**
 *
 * @author 18062
 */
public class MealCard {
    //Declare everything
      int n;
        char a= 3;
        double aL=3.50;
        char b=4;
        double bL=4.50;
        char c=4;
        double cL=4.50;
        char e=2;
        double eL=4.50;
        char f=2;
        double fL=4.50;
        char g=2;
        double gL=2.50;
        char h=2;
        double hL=2.25;
        char i=0;
        double iL=0;
        char j=2;
        double jL=2.50;
        char q=2;
        double qL=2.50;
        
        char choice;
        char response;
        char size;
    public void Mealplan( double d)
    {
     
       
        
        Scanner user_input=new Scanner(System.in);
        
        
        System.out.println("Time for lunch!");
        System.out.println("A-Cheeseburger 3 POINTS"+"\n"+"B-Chicken Strips 4 POINTS"+"\n"+"C-Club Sandwich 4 POINTS"+"\n"+"H-Bacon CHeeseburger 4 POINTS"+"\n"+"E-SIDE OF FRIES 2 POINTS"+"\n"+"F-SIDE OF CHIPS 2 POINTS"+"\n"+"G-SIDE OF Bread Rolls 2 POINTS"+"\n"+"I-WATER FREE"+"\n"+"q-SODA 2 points"+"\n"+"J-SWEET TEA 2 Points");
        System.out.println("Please make your selection , One at a time.");
        System.out.println("Remember you can add points anytime by pressing 'z'.");
        choice = user_input.next().charAt(0);
           this.MakeChoice(d, choice);
        
       
    }
    
    
    
    
    
    public void MakeChoice(double d , char choice)
    {
        Scanner user_input=new Scanner(System.in);
        while (n==0)
        {
          switch (choice) {
              case 'A':
              case 'a':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-aL;
                  }
                  else 
                  d=d-a;
                  
                  break;
              case 'B':
              case 'b':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-bL;
                  }
                  else 
                  d=d-b;
                  break;
              case 'C':
              case 'c':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-cL;
                  }
                  else 
                  d=d-c;
                  break;
              case 'e':
              case 'E':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-eL;
                  }
                  else 
                  d=d-e;
                  break;
              case 'f':
              case 'F':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-fL;
                  }
                  else 
                  d=d-f;
                  break;
              case 'g':
              case 'G':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-gL;
                  }
                  else 
                  d=d-g;
                  break;
              case 'h':
              case 'H':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-hL;
                  }
                  else 
                  d=d-h;
                  break;
              case 'i':
              case 'I':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-iL;
                  }
                  else 
                  d=d-i;
                  break;
     
              case 'j':
              case 'J':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-jL;
                  }
                  else 
                  d=d-j;
                  break;
                  
              case 'q':
              case 'Q':
                  System.out.println("Would you like M or L");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-qL;
                  }
                  else 
                  d=d-q;
                  break;
                  
             
          }
          
       System.out.println("Would you like anything else?(Y/n)");
       response = user_input.next().charAt(0);
       if (response=='Y'||response=='y')
       {
           System.out.println("What else would you like?");
           choice = user_input.next().charAt(0);
           n=0;
       }
       else 
       {
           System.out.println("\nYour remaining balance is"+" "+d);
           n=1;
       }
     } 
     
   }

}