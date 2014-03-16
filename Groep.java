/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opgave1;

/**
 *
 * @author guy
 */
public class Groep {
    private Student[] studenten;
    private int index;
    Groep(int aantal)
    {
        index = 0;
        studenten = new Student[aantal];
    }
    
    public boolean voegToe(Student s)
    {
        if (index >= studenten.length) 
            return false;
        studenten[index] = s;
        index++;
        return true;
    }
    
    public Student getStudent(int i)
    {
        if (i <= index) {
            return studenten[i];
        } 
        return null;
    }
    
    public String toString()
    {
        int i;
        String s;
        s = "";
        Student stud;
        for (i = 0; i < studenten.length; i++)
        {
           stud = studenten[i];
           s += stud.toString() + "\n";
        }
        return s;
    }
}
