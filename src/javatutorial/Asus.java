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
public class Asus implements Laptop{
    int price=0;
    int series=0;
    String spec="standart";
    
    public void changePrice(int newValue){
        price= newValue;
    }
    public void setSeries(int newValue){
        series= newValue;
    }
    public void setSpec(String newData){
        spec= newData;
    }
    public void printState2(){
        System.out.println("price: "+price+" series: "+series+" Spec: "+spec);
    }
}
