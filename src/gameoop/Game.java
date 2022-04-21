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
public class Game {
    public static void Start(String battle)
    {
        //Variables inicializadas para la creacion de personajes
        Soldier soldado = new Soldier();
        Cavalry caballero = new Cavalry();
        Magician mago = new Magician();
        Computer computadora = new Computer();
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
                        computadora.danhoRecibido(soldado.getAttack());
                    }else{
                        computadora.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(computadora.getHr())){
                        soldado.danhoRecibido(computadora.getAttack());
                    }else{
                        soldado.esquivar();
                    }
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
                        computadora.danhoRecibido(caballero.getAttack());
                    }else{
                        computadora.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(computadora.getHr())){
                        caballero.danhoRecibido(computadora.getAttack());
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
                        computadora.danhoRecibido(mago.getAttack());
                    }else{
                        computadora.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(computadora.getHr())){
                        mago.danhoRecibido(computadora.getAttack());
                    }else{
                        mago.esquivar();
                    }
                }
                break;
            }
            
            case "BA":{
                System.out.println( "\nCaballero vs Guerrero" ) ; 
                int num =0;
                while(soldado.estadoVida()&&caballero.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        soldado.danhoRecibido(caballero.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        caballero.danhoRecibido(soldado.getAttack());
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
                        soldado.danhoRecibido(mago.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        mago.danhoRecibido(soldado.getAttack());
                    }else{
                        mago.esquivar();
                    }
                }
                break;
            }
            
            case "AB":{
                System.out.println( "\nGuerrero vs Csoldadoallero" ) ; 
                int num =0;
                while(caballero.estadoVida()&&soldado.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(soldado.getHr())){
                        caballero.danhoRecibido(soldado.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        soldado.danhoRecibido(caballero.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                }
                break;
            }
            
            case "CB":{
                System.out.println( "\nMago vs Csoldadoallero" ) ; 
                int num =0;
                while(caballero.estadoVida()&&mago.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        caballero.danhoRecibido(mago.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        mago.danhoRecibido(caballero.getAttack());
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
                        mago.danhoRecibido(soldado.getAttack());
                    }else{
                        mago.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        soldado.danhoRecibido(mago.getAttack());
                    }else{
                        soldado.esquivar();
                    }
                }
                break;
            }
            
            case "BC":{
                System.out.println( "\nCaballero vs Mago" ) ; 
                int num =0;
                while(mago.estadoVida()&&caballero.estadoVida())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(ChequeoAciertos.tasaAciertos(caballero.getHr())){
                        mago.danhoRecibido(caballero.getAttack());
                    }else{
                        mago.esquivar();
                    }
                    
                    if(ChequeoAciertos.tasaAciertos(mago.getHr())){
                        caballero.danhoRecibido(mago.getAttack());
                    }else{
                        caballero.esquivar();
                    }
                }
                break;
            }            
        }
    }
}
