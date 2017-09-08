package Package1Demo;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import javax.swing.text.html.HTMLDocument.Iterator;
/**
* creating a class Student as mention in the question;
* than created three fields- name, rollNo and department
* and than created a constructor and used getter-setter;
*/
public class StudentDemo {
      
	  String name;
      int rollNo;
      String department;
    
      public StudentDemo(String name, int rollNo, String department) {

    	    super();
            this.name = name;
            this.rollNo = rollNo;
            this.department = department;
}
  
       public String getName() {
       return name;
}
       public void setName(String name) {
       this.name = name;
}
       public int getRollNo() {
       return rollNo;
}
       public void setRollNo(int rollNo) {
       this.rollNo = rollNo;
}
       public String getDepartment() {
       return department;
}
       public void setDepartment(String department) {
       this.department = department;
}
/**
* In here creating toString method
* The toString() method returns the string
* representation of the object.
*
*/
       
    public String toString(){
         
    	return "Student name is "+ name+".\nRoll number is :"+rollNo+"\nDepartment is "+department+".\n";
        
    }
}