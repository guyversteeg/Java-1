package opgave1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guy
 */
public class Student {
    String voornaam;
    String achternaam;
    int studentnummer;
    public Student(String voor, String achter, int nummer)
    {
        voornaam = voor;
        achternaam = achter;
        studentnummer = nummer;
    }
    
    public String toString()
    {
        return voornaam + " " + achternaam + " " + "s" + studentnummer;
    }

    public void setNaam (String voor, String achter)
    {
     voornaam = voor;
     achternaam = achter;
    }
}