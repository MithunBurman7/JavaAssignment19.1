package Package1Demo;
/**
* In here importing class, which are belong from java.util.package;
*/
import java.util.HashSet;
import java.util.Iterator;
/**
* In here created a class StudentDetail to store detail of
* students by using HashSet;
* HashSet class is used to create a collection that uses
* a hash table for storage;
*/
        public class DetailsDemo {
        
        public static void main(String[] args) {
      
        	HashSet<StudentDemo> objStd= new HashSet<StudentDemo>();
                 System.out.println("Display of students detail\n");
/**
* Creating Students details
* and adding Students to HashSet
*
*/
                 StudentDemo one= new StudentDemo("George",37,"Maths");
                 StudentDemo second= new StudentDemo("Rogger",30,"Social");
                 StudentDemo third= new StudentDemo("Paul",4,"Hindi");
            
            
      objStd.add(one);
      objStd.add(second);
      objStd.add(third);
      
/**
* In here using iterator
* and than using while loop for checking the value
* and call hasNext() which will returns true if there are
* more elements. Otherwise, returns false.
*/
Iterator iterator=objStd.iterator();
while(iterator.hasNext()){
System.out.println(iterator.next());
}
}
}