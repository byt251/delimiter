//** Author: Bethlehem Teshome/
//** 09/10/2017
// * Using Delimiters/

import java.util.Scanner;
public class Delimiters {
public static void main(String[] args){
    String s1,s2;
    Scanner keyboard1= new Scanner(System.in);
    Scanner keyboard2= new Scanner(System.in);
    keyboard2.useDelimiter("!!"); //use "!!" as Delimiter
    System.out.println("Enter two of your favourite movie actors");
    s1 = keyboard1.next();
    s2 = keyboard1.next();
    System.out.println(" your favourite movie actors are" +s1 +"\t" +s2); // escape sequence
    System.out.println("Enter two of your favourite movie actors (Delimited by !!) ");
    s1= keyboard2.next();
    s2= keyboard2.next();
    System.out.println("your favourite movie actors are\"" + s1 + "\"\n\""+ s2 +"\""); //escape sequence

}
}

