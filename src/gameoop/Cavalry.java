/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

/**
 *
 * @author amand
 */
public class Cavalry extends Personaje{
    public Cavalry()
    {
        name = "Caballeros";
        life = 80;
        attack =15;
        defense =12;
        hr=0.75;
    }

    @Override
    public void evitar() {
        System.out.println(this.name +" se inclino y escapo del ataque del oponente!!"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
