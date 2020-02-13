/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutility;

/**
 *
 * @author 18062
 */
public class Studentclass
{
    String StudentAddress,StudentName;
    int Studentage;
    int i;
    
    
     public void setStudentName(String StudentName) //Making set able to be accessed
  {
      this.StudentName= StudentName;
  }
     public void setStudentAddress(String StudentAddress) //Making set able to be accessed
  {
      this.StudentAddress= StudentAddress;
  }
     public void setStudentage(int Studentage) //Making set able to be accessed
  {
      this.Studentage= Studentage;
  }
    public String getStudentName() //Allowing the get function to be accessed to grab data
    {
        return StudentName;
    }
    public String getStudentAddress() //Allowing the get function to be accessed to grab data
    {
        return StudentAddress;
    }
    public int getStudentage() //Allowing the get function to be accessed to grab data
    {
        return Studentage;
    }
    
    
    
}
