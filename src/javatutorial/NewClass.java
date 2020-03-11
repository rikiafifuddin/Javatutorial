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

class Bicyle{
    int candence =0;
    int speed =0;
    int gear =1;
    
    void changeCandence(int newValue){
        candence = newValue;
    }
    void changeGear(int newValue){
        gear = newValue;
    }
    void speedUp(int increment){
        speed = speed+increment;
    }
    void applyBreak(int decreement){
        speed= speed-decreement;
    }
    void printState(){
        System.out.println("candence:"+ candence +"Speed:"+ speed +"gear:"+ gear);
    }
}

class MountainBike extends Bicyle{
    int price=0;
    
    void changePrice(int newValue){
        price = newValue;
    }
}
