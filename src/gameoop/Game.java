/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoop;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class Game {
    public static void Start(String battle)
    {
        Soldier soldado = new Soldier();
        Cavalry caballero = new Cavalry();
        Magician mago = new Magician();
        Computadora computadora = new Computadora();
        Scanner scanner = new Scanner(System.in);
        switch(battle)
        {
            case "AD":{ 
                System.out.println( "\nGuerrero vs Computadora" ) ; 
                int num =0;
                while(computadora.estadoVida()&&soldado.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        computadora.danoRecibido(soldado.getAttack());
                    }else{
                        computadora.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(computadora.getHr())){
                        soldado.danoRecibido(computadora.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                    scanner.nextLine();
                }
                break;
            }
            
            case "BD":{
                System.out.println( "\nCaballero vs Computadora" ) ; 
                int num =0;
                while(computadora.estadoVida()&&caballero.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        computadora.danoRecibido(caballero.getAttack());
                    }else{
                        computadora.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(computadora.getHr())){
                        caballero.danoRecibido(computadora.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                }
                break;
            }
            
            case "CD":{
                System.out.println( "\nMago vs Computadora" ) ; 
                int num =0;
                while(computadora.estadoVida()&&mago.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        computadora.danoRecibido(mago.getAttack());
                    }else{
                        computadora.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(computadora.getHr())){
                        mago.danoRecibido(computadora.getAttack());
                    }else{
                        mago.esquivar();
                    }
                }
                break;
            }
            
            case "BA":{ 
                System.out.println( "\ncaballero vs Guerrero" ) ; 
                int num =0;
                while(soldado.estadoVida()&&caballero.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        soldado.danoRecibido(caballero.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        caballero.danoRecibido(soldado.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                }
                break;
            }
            
            case "CA":{
                System.out.println( "\nMago vs Guerrero" ) ; 
                int num =0;
                while(soldado.estadoVida()&&mago.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        soldado.danoRecibido(mago.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        mago.danoRecibido(soldado.getAttack());
                    }else{
                        mago.esquivar();
                    }
                }
                break;
            }
            
            case "AB":{
                System.out.println( "\nGuerrero vs caballero" ) ; 
                int num =0;
                while(caballero.estadoVida()&&soldado.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        caballero.danoRecibido(soldado.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        soldado.danoRecibido(caballero.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                }
                break;
            }
            
            case "CB":{
                System.out.println( "\nMago vs caballero" ) ; 
                int num =0;
                while(caballero.estadoVida()&&mago.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        caballero.danoRecibido(mago.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        mago.danoRecibido(caballero.getAttack());
                    }else{
                        mago.esquivar();
                    }
                }
                break;
            }
            
            case "AC":{
                System.out.println( "\nGuerrero vs Mago" ) ; 
                int num =0;
                while(mago.estadoVida()&&soldado.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        mago.danoRecibido(soldado.getAttack());
                    }else{
                        mago.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        soldado.danoRecibido(mago.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                }
                break;
            }
            
            case "BC":{
                System.out.println( "\ncaballero vs Mago" ) ; 
                int num =0;
                while(mago.estadoVida()&&caballero.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        mago.danoRecibido(caballero.getAttack());
                    }else{
                        mago.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        caballero.danoRecibido(mago.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                }
                break;
            }            
        }
    }
}