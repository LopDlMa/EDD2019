/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;

/**
 *
 * @author PC
 */
public class Nodo {

  private int Elemento;
    private int x;
    private int y;
    
    // -------APUNTADOR
    private Nodo siguente;
    
    
    Nodo(int elemento, int x, int y){
        this.Elemento = elemento;
        this.x = x;
        this.y = y;          
    }
    /**
     * @return the Elemento
     */
    public int getElemento() {
        return Elemento;
    }


    /**
     * @return the siguente
     */
    public Nodo getSiguente() {
        return siguente;
    }

    /**
     * @param siguente the siguente to set
     */
    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    
}
