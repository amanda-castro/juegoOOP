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
Fecha de Revision:  
*/
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
    
    //Este metodo se realiza cuando el personaje recibe un ataque
    public void  atacado( int _attack)
    {
        int hurt =0;
        int residualLife; //Vida restante
        if(vive()){
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
    
    //Este metodo sirve para verificar si el personaje vive
    public boolean vive()
    {
        boolean estado = true;
        if (this.life <=0)
        {
            System.out.println(this.name + " ha muerto... Fin del juego");
            estado = false;
        }
        return estado;
    }
    
    //Este metodo funciona cuando se esquiva un golpe
    public void evitar()
    {
        System.out.println("No hubo golpe... "+ this.name +" evitalo!!!");
    }
}
