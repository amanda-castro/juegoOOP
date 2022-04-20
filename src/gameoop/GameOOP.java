/*
 * To change this license heacomputadorar, choose License Heacomputadorars in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Amanda Castro
 * Proyecto: Juego POO
 * Fecha: 20-04-2022
 * Version: 1.1
 * Comentario: Se reviso el codigo y se rscanneractorizo
 */
public class GameOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cocomputadora application logic here
        
        //Scanner que recibe las opciones ingresadas
        Scanner scanner = new Scanner(System.in);
        
        String role = "";
        String opponent = "";
        
        //Menu para seleccionar el personaje principal
        System.out.println("Por favor seleccione un personaje e ingrese el literal computadoral personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
	role = scanner.nextLine();
        
        //Menu para seleccionar el enemigo
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
        
        //Esta parte del juego selecciona quien esta jugando contra quien.
        //Inicia la Batalla
        Juego.jugar(role+opponent);
        
    }
    
   
}
