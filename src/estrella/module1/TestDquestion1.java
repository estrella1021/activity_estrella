/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella.module1;

/**
 *
 * @author User
 */
public class TestDquestion1 {
public static void main (String [] args){
String raq = "raquel";

char name[] = {'r','a','q','u','e','l'};
char middlechar = raq.charAt(raq.length()/4);
char midar[] = {middlechar};
String up =new String (midar).toUpperCase();

System.out.println(raq.replace(middlechar, up.charAt(0)));
System.out.println(raq.indexOf("q"));

}
}