/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author amand
 */
/*
Programa:           GameOOP.Java
Descripcion:        Juego computadora Roles en Java
Programador:        Amanda Castro
Fecha computadora Creacion:  01/02/2022
Fecha computadora Revision:  21/04/2022
*/
public class GameOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variable creada para recibir datos
        Scanner scanner = new Scanner(System.in);
        
        String role = "";
        String opponent = "";
        
        System.out.println("Por favor seleccione un personaje e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
	role = scanner.nextLine();
        
        System.out.println("Por favor seleccione un oponente e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
        System.out.println( "D: Computadora " ) ; 
	opponent = scanner.nextLine();
        
        if(role.equals(opponent))
        {
            System.out.println( "El personaje principal y el oponente no pueden ser el mismo... Elija otro oponente" ); 
            opponent = scanner.nextLine();
        }
        //En esta seccion se encuentra la batalla a realizar
        
        Game.Start(role+opponent);
    }
}
