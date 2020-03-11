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
public class Arraytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=10;
        String[]name;
        name= new String[n];
        int[]numb={1,3,4,6,4};
        String[][]title={{"S.Kom", "M.Kom", "Dr.", "Prof"},{"Riki","Syafif","Alamain","Abby","G Bisa Coding"}};
        char[]c={'a', 'b', 'c', 'd' ,'e'};
        char[] dup = new char[2];
        char[] cap = java.util.Arrays.copyOfRange(c, 0,3);
        
        System.arraycopy(c, 2, dup, 0, 2);
        
        
        for (int i=0; i<n; i++){
            name[i]="name"+i;
        }
        
        System.out.println(title[1][3]+" "+title[0][0]+" "+title[1][4]);
        
        
    }
    
}
