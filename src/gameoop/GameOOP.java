/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class GameOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Soldier ab = new Soldier();
        Cavalry bc = new Cavalry();
        Magician cd = new Magician();
        GameUtil de = new GameUtil();
        Scanner ef = new Scanner(System.in);
        
        String role = "";
        String opponent = "";
        String battle = "";
        int number = 0;
        
        System.out.println("Por favor seleccione un personaje e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
	role = ef.nextLine();
        
        System.out.println("Por favor seleccione un oponente e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
        System.out.println( "D: Computadora " ) ; 
	opponent = ef.nextLine();
        
        if(role.equals(opponent))
        {
            System.out.println( "El personaje principal y el oponente no pueden ser el mismo... Elija otro oponente" ); 
            opponent = ef.nextLine();
        }
        
        battle = role+opponent;
        
        switch(battle)
        {
            case "AD":{
                System.out.println( "" ) ; 
                System.out.println( "Guerrero vs Computadora" ) ; 
                int num =0;
                while(de.booleano1()&&ab.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(ab.getHr())==1){
                        de.metodo1(ab.getAttack());
                    }else{
                        de.metodo2();
                    }
                    
                    if(int1(de.getHr())==1){
                        ab.metodo1(de.getAttack());
                    }else{
                        ab.metodo2();
                    }
                    ef.nextLine();
                }
                break;
            }
            
            case "BD":{
                System.out.println( "" ) ; 
                System.out.println( "Caballero vs Computadora" ) ; 
                int num =0;
                while(de.booleano1()&&bc.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(bc.getHr())==1){
                        de.metodo1(bc.getAttack());
                    }else{
                        de.metodo2();
                    }
                    
                    if(int1(de.getHr())==1){
                        bc.metodo1(de.getAttack());
                    }else{
                        bc.metodo2();
                    }
                }
                break;
            }
            
            case "CD":{
                System.out.println( "" ) ; 
                System.out.println( "Mago vs Computadora" ) ; 
                int num =0;
                while(de.booleano1()&&cd.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(cd.getHr())==1){
                        de.metodo1(cd.getAttack());
                    }else{
                        de.metodo2();
                    }
                    
                    if(int1(de.getHr())==1){
                        cd.metodo1(de.getAttack());
                    }else{
                        cd.metodo2();
                    }
                }
                break;
            }
            
            case "BA":{
                System.out.println( "" ) ; 
                System.out.println( "Caballero vs Guerrero" ) ; 
                int num =0;
                while(ab.booleano1()&&bc.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(bc.getHr())==1){
                        ab.metodo1(bc.getAttack());
                    }else{
                        ab.metodo2();
                    }
                    
                    if(int1(ab.getHr())==1){
                        bc.metodo1(ab.getAttack());
                    }else{
                        bc.metodo2();
                    }
                }
                break;
            }
            
            case "CA":{
                System.out.println( "" ) ; 
                System.out.println( "Mago vs Guerrero" ) ; 
                int num =0;
                while(ab.booleano1()&&cd.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(cd.getHr())==1){
                        ab.metodo1(cd.getAttack());
                    }else{
                        ab.metodo2();
                    }
                    
                    if(int1(ab.getHr())==1){
                        cd.metodo1(ab.getAttack());
                    }else{
                        cd.metodo2();
                    }
                }
                break;
            }
            
            case "AB":{
                System.out.println( "" ) ; 
                System.out.println( "Guerrero vs Caballero" ) ; 
                int num =0;
                while(bc.booleano1()&&ab.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(ab.getHr())==1){
                        bc.metodo1(ab.getAttack());
                    }else{
                        bc.metodo2();
                    }
                    
                    if(int1(bc.getHr())==1){
                        ab.metodo1(bc.getAttack());
                    }else{
                        ab.metodo2();
                    }
                }
                break;
            }
            
            case "CB":{
                System.out.println( "" ) ; 
                System.out.println( "Mago vs Caballero" ) ; 
                int num =0;
                while(bc.booleano1()&&cd.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(cd.getHr())==1){
                        bc.metodo1(cd.getAttack());
                    }else{
                        bc.metodo2();
                    }
                    
                    if(int1(bc.getHr())==1){
                        cd.metodo1(bc.getAttack());
                    }else{
                        cd.metodo2();
                    }
                }
                break;
            }
            
            case "AC":{
                System.out.println( "" ) ; 
                System.out.println( "Guerrero vs Mago" ) ; 
                int num =0;
                while(cd.booleano1()&&ab.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(ab.getHr())==1){
                        cd.metodo1(ab.getAttack());
                    }else{
                        cd.metodo2();
                    }
                    
                    if(int1(cd.getHr())==1){
                        ab.metodo1(cd.getAttack());
                    }else{
                        ab.metodo2();
                    }
                }
                break;
            }
            
            case "BC":{
                System.out.println( "" ) ; 
                System.out.println( "Caballero vs Mago" ) ; 
                int num =0;
                while(cd.booleano1()&&bc.booleano1())
                {
                    num++;
                    System.out.println( "Ronda #"+num ) ;
                    if(int1(bc.getHr())==1){
                        cd.metodo1(bc.getAttack());
                    }else{
                        cd.metodo2();
                    }
                    
                    if(int1(cd.getHr())==1){
                        bc.metodo1(cd.getAttack());
                    }else{
                        bc.metodo2();
                    }
                }
                break;
            }
            
            
        }
    }
    
    public static int int1(double hr)
    {
        Random w = new Random();
        int flag;
        int a = w.nextInt(100);
        
        if(a< (int)(hr*100)){
            flag =1;
        }else
        {
            flag =0;
        }
        
        return flag;
    }
}
