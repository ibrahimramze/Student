/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author ibrah
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student[] list= new student[3]; // array of objects
        student s1= new student(); // object s1 for student class
        s1.name="sifa";
        s1.age=34;
        System.out.println(s1.age + s1.name );
        
    }
    
}
