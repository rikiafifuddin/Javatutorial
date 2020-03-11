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
public class SearchArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] number={1,2,23,102,1000,32,11,1};
        int [][] number2={
            {1,32,23,24,2},
            {23,1,232,21,1},
            {1,2,2,2,3,1,1,1}
        };
        int nSeach=1;
        boolean Status = false;
        int i;
        int j = 0;
        
        search:
        for (i=0; i<number2.length;i++){
            for (j=0; j<number2[i].length; j++){
                if (number2[i][j]==nSeach){
                    Status = true;
                    break search;
                }
            }
        }
        /**for (i=0; i<number.length; i++){
            if(number[i]==nSeach){
                Status=true;
                break;
            }
        } */
        if (Status){
            System.out.println("Number found at Index : "+i+","+j);
        }
        else{
            System.out.println("Number Not Found In Array");
        }
    }
    
}
