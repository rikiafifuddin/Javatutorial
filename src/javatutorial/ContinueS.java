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
public class ContinueS {
    public static void main(String[]args){
    String s ="mom of marry is maryying marry's father"+ "marry die may last year";
    int n= s.length();
    int countM=0;
    
    for (int i=0; i<n; i++){
        if(s.charAt(i) != 'm')
            continue;
        countM++;
    }
        System.out.println("Found m : "+countM+" on String");
    }
    
}
