/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

import java.util.Random;

/**
 *
 * @author amand
 */
public class Aleatoreo {
      //Este metodo sirve para verificar si en esa ronda acerto el golpe o no el personaje
    public static boolean rndAtaque(double hr)
    {
        Random rnd = new Random();
        int resultado = rnd.nextInt(100);
        boolean flag= (resultado< (int)(hr*100));
        
        return flag;
    }
}
