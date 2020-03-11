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

public class Javatutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicyle bike = new Bicyle();
        Bicyle vespa = new Bicyle();
        MountainBike mbike= new MountainBike();
        
        bike.changeGear(1);
        bike.speedUp(10);
        bike.changeGear(2);
        bike.speedUp(30);
        bike.changeGear(3);
        bike.applyBreak(20);
        
        vespa.changeGear(1);
        vespa.speedUp(30);
        vespa.changeGear(2);
        vespa.changeGear(3);
        vespa.speedUp(50);
        
        mbike.changeCandence(100);
        mbike.changePrice(40000000);
        
        System.out.println("Candence: "+ mbike.candence +" price: "+ mbike.price);
        
        bike.printState();
        vespa.printState();
        
        Laptop L= new Asus();
        L.changePrice(100000);
        L.setSeries(123);
        L.setSpec("Best");
        L.printState2();
    }
    
}
