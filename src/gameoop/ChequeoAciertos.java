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
public class ChequeoAciertos {
    //Este metodo maneja la tasa de aciertos entre los ataques de los personajes
    public static boolean tasaAciertos(double hr)
    {
        Random w = new Random();
        int rndA = w.nextInt(100);
        boolean flag = (rndA< (int)(hr*100));       
        return flag;
    }
}
