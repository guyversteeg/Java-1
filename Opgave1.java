/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opgave1;
import java.util.Scanner;
/**
 *
 * @author guy
 */
public class Opgave1 {
    
    Opgave1()
    {
        /**
        Student stud = new Student("guy", "hoi", 1);
        Groep groepje = new Groep(6);
        groepje.voegToe(stud);
        System.out.println(groepje.getStudent(0).toString());
        */
        System.out.println("Hoe groot moet de groep studenten gemaakt worden?");
        Scanner scanner = new Scanner(System.in);
        int aantal = scanner.nextInt();
        Groep groepje = new Groep(aantal);
        System.out.println("De studenten moeten ingevoerd worden.");
        int i;
        String voornaam;
        String achternaam;
        int studentnummer;
        for(i=0; i < aantal; i++)
        {
            System.out.println("Wat is de voornaam van de student?");
            voornaam = scanner.next();
            System.out.println("Wat is de achternaam van de student?");
            achternaam = scanner.next();
            System.out.println("Wat is het studentnummer van de student?");
            studentnummer = scanner.nextInt();
            groepje.voegToe(new Student(voornaam, achternaam, studentnummer));
        }
        System.out.println("De groep bevat nu: \n");
        //System.out.println(groepje.getStudent(aantal).toString()); // Ik snap niet wat hier precies mis mee is? 
        System.out.println(groepje);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Opgave1();
    }
    
}
