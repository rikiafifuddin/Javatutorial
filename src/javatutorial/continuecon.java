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
public class continuecon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kata= "i have no money anymore";
        String sub= "no m";
        int n= kata.length();
        boolean ketemu =false;
        
      cari:
        for (int i=0; i<n; i++){
            int x= sub.length();
            int j=i;
            int k=0;            
            while(x-- !=0){
                if (kata.charAt(j++) != sub.charAt(k++)){
                    continue cari;
                }
            }
            ketemu = true;
            break cari;
        } 
        System.out.println (ketemu ? sub+" Found on String" : sub+" Not Found on String");
    }
    
}
