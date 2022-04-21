package gameoop;

import java.util.Random;

/**
 *
 * @author Agustin
 */
public class ChequeoAciertos {
        public static boolean tasaAciertos(double hr)
    {
        Random w = new Random();
        int rndm = w.nextInt(100);
        boolean flag = (rndm< (int)(hr*100));    
        return flag;
    }
}
