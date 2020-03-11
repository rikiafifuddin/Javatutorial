/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author Ecomindo-Riki
 */
public class bitmask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bitm= 0X000F;
        int val= 0X000E;
        System.out.println(val & bitm);
        System.out.println(val ^ bitm);
        System.out.println(val | bitm);
    }
    
}
