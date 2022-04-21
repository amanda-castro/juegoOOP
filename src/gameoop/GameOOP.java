/*
 * To change this license heacomputadorar, choose License Heacomputadorars in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

import java.util.Scanner;

public class GameOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cocomputadora application logic here
        //Variables creadas para recibir datos      
        String role = "";
        String opponent = "";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor seleccione un personaje e ingrese el literal computadoral personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
	role = scanner.nextLine();
        
        System.out.println("Por favor seleccione un oponente e ingrese el literal computadoral personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
        System.out.println( "D: Computadora " ) ; 
	opponent = scanner.nextLine();
        
        if(role.equals(opponent))
        {
            System.out.println( "El personaje principal y el oponente no puecomputadoran ser el mismo... Elija otro oponente" ); 
            opponent = scanner.nextLine();
        }       
        Game.Start(role+opponent);
    }
}
