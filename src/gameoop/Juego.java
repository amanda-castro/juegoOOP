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
public class Juego {
    
   public static void jugar(String battle)
   {
       
        //Creacion de Personajes del Juego
        Soldier soldado = new Soldier();
        Cavalry caballero = new Cavalry();
        Magician mago = new Magician();
        Computer computadora = new Computer();
        
        int num =0;
       switch(battle)
        {
            case "AD":{
                System.out.println( "\nGuerrero vs Computadora" ) ; 
                while(computadora.vive()&&soldado.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(soldado.getHr())){
                        computadora.atacado(soldado.getAttack());
                    }else{
                        computadora.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(computadora.getHr())){
                        soldado.atacado(computadora.getAttack());
                    }else{
                        soldado.evitar();
                    }
                }
                break;
            }
            
            case "BD":{
                System.out.println( "\nCaballero vs Computadora" ) ; 
                while(computadora.vive()&&caballero.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(caballero.getHr())){
                        computadora.atacado(caballero.getAttack());
                    }else{
                        computadora.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(computadora.getHr())){
                        caballero.atacado(computadora.getAttack());
                    }else{
                        caballero.evitar();
                    }
                }
                break;
            }
            
            case "CD":{
                System.out.println( "\nMago vs Computadora" ) ; 
                while(computadora.vive()&&mago.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(mago.getHr())){
                        computadora.atacado(mago.getAttack());
                    }else{
                        computadora.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(computadora.getHr())){
                        mago.atacado(computadora.getAttack());
                    }else{
                        mago.evitar();
                    }
                }
                break;
            }
            
            case "BA":{
                System.out.println( "\nCaballero vs Guerrero" ) ; 
                while(soldado.vive()&&caballero.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(caballero.getHr())){
                        soldado.atacado(caballero.getAttack());
                    }else{
                        soldado.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(soldado.getHr())){
                        caballero.atacado(soldado.getAttack());
                    }else{
                        caballero.evitar();
                    }
                }
                break;
            }
            
            case "CA":{
                System.out.println( "\nMago vs Guerrero" ) ; 
                while(soldado.vive()&&mago.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(mago.getHr())){
                        soldado.atacado(mago.getAttack());
                    }else{
                        soldado.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(soldado.getHr())){
                        mago.atacado(soldado.getAttack());
                    }else{
                        mago.evitar();
                    }
                }
                break;
            }
            
            case "AB":{
                System.out.println( "\nGuerrero vs Caballero" ) ; 
                while(caballero.vive()&&soldado.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(soldado.getHr())){
                        caballero.atacado(soldado.getAttack());
                    }else{
                        caballero.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(caballero.getHr())){
                        soldado.atacado(caballero.getAttack());
                    }else{
                        soldado.evitar();
                    }
                }
                break;
            }
            
            case "CB":{
                System.out.println( "\nMago vs Caballero" ) ; 
                while(caballero.vive()&&mago.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(mago.getHr())){
                        caballero.atacado(mago.getAttack());
                    }else{
                        caballero.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(caballero.getHr())){
                        mago.atacado(caballero.getAttack());
                    }else{
                        mago.evitar();
                    }
                }
                break;
            }
            
            case "AC":{
                System.out.println( "\nGuerrero vs Mago" ) ; 
                while(mago.vive()&&soldado.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(soldado.getHr())){
                        mago.atacado(soldado.getAttack());
                    }else{
                        mago.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(mago.getHr())){
                        soldado.atacado(mago.getAttack());
                    }else{
                        soldado.evitar();
                    }
                }
                break;
            }
            
            case "BC":{
                System.out.println( "\nCaballero vs Mago" ) ; 
                while(mago.vive()&&caballero.vive())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(Aleatoreo.rndAtaque(caballero.getHr())){
                        mago.atacado(caballero.getAttack());
                    }else{
                        mago.evitar();
                    }
                    
                    if(Aleatoreo.rndAtaque(mago.getHr())){
                        caballero.atacado(mago.getAttack());
                    }else{
                        caballero.evitar();
                    }
                }
                break;
            }
            
            
        }
   }
    
}
