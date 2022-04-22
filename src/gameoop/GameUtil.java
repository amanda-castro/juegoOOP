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

/*
Programa:           GameOOP.Java
Descripcion:        Juego de Roles en Java
Programador:        Amanda Castro
Fecha de Creacion:  01/02/2022
Fecha de Revision:  21/04/2022
*/
   
    //Este metodo hace un chequeo a ver si alguno de los personajes murio
public class GameUtil {
    String name = "Computadora";    //nombre
    int life =80;     //vida
    int attack=15;     //fuerza de ataque
    int defense=5;     //fuerza de defensa
    double hr=0.75;       //taza de aciertos
    
    public int getLife()
    {
        return this.life;
    }
    
    public void setLife(int _life)
    {
        this.life = _life;
    }
    
    public int getAttack()
    {
        return this.attack;
    }
    
    public void setAttack(int _attack)
    {
        this.attack = _attack;
    }
    
    public int getDefense()
    {
        return this.defense;
    }
    
    public void setDefense(int _defense)
    {
        this.defense = _defense;
    }
    
    public double getHr()
    {
        return this.hr;
    }
    
    public void setHr(double _hr)
    {
        this.hr = _hr;
    }
    
    //Metodo que se activa cuando el personaje recibe un ataque
    public void  danoRecibido( int _attack)
    {
        int hurt =0;
        int residualLife; //Vida restante
        if(estadoVida()){
            if(this.attack>this.defense){
                hurt = attack- defense;
            }
            residualLife = life-hurt;
            if(hurt>0){
                System.out.println(this.name +" recibio "+hurt+" puntos de ataque... Daño!!");
            }else{
                System.out.println(this.name +" recibio un ataque, pero es muy debil... Aprovecha y ataca!!");
            }
            if(residualLife<0)residualLife=0;
            System.out.println("Salud restante: "+residualLife);
            this.life =residualLife;
            
        }
    }
    
    public boolean estadoVida()
    {
        boolean vida = true;
        if (this.life <=0)
        {
            System.out.println(this.name + " ha muerto... Fin del juego");
            vida = false;
        }
        return vida;
    }
    
    //Metodo utilizado cuando un personaje esquiva un ataque
    public void esquivar()
    {
        System.out.println("No hubo golpe... "+ this.name +" evitalo!!!");
    }
}
