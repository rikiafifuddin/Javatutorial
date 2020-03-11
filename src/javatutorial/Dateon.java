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
public class Dateon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month=2;
        int year=2020;
        int numday=0;
        
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numday=31;
                break;
            case 4: case 6: case 9: case 11:
                numday=30;
                break;
            case 2:
                if(((year %4 ==0 ) && !(year%100==0))|| (year % 400 ==0))
                    numday =29;
                else
                    numday=28;
                break;
            default: System.out.println("Invalit Month");
            break;
        }
        System.out.println("Number of Days : "+numday);
    }
    
}
