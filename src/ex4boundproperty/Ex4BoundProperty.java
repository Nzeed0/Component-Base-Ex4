/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4boundproperty;

import java.util.Scanner;

public class Ex4BoundProperty {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PropertyBean mySource = new PropertyBean();
        Person1 P1 = new Person1();
        Person2 P2 = new Person2();
        mySource.addPropertyChangeListener(P1);
        mySource.addPropertyChangeListener(P2);
        Inputtext(mySource);
    }
    
    static void Inputtext(PropertyBean Recieve){
        Scanner sc = new Scanner(System.in);
        String text = "";
        
        while(true){
            System.out.print("Enter Score ");
            text = sc.nextLine();
            if(text.equals("")) return;
            else {
                Recieve.setFootballScore(text);
                Recieve.setFootballScore(text);
            }
        }
    }
}
