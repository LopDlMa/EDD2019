/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bolsa {

    private Nodo cabeza;
    private Nodo cola;
    private int contar = 0;
    
    public Bolsa() {
        cabeza = null;
        cola = null;
    }

    public void insertar(int Elemento, int x, int y) {
        Nodo nuevo = new Nodo(Elemento, x, y);

        //a)  
        if (cabeza == null) {
            contar++;
            cabeza = cola = nuevo;
            cola.setSiguente(cabeza);
        } else {
            //b-c)
            contar++;
            nuevo.setSiguente(cabeza);
            cabeza = nuevo;
            cola.setSiguente(cabeza);//celeste
        }

    }

    public void Recorrer() {
        Nodo temp = cabeza;
        if (cabeza != null) {
            do {
                System.out.println("viendo elementos: " + temp.getElemento() + ", " + temp.getX() + ", " + temp.getY());
                temp.getSiguente();
                temp = temp.getSiguente();
                System.out.println("-------------------------");
            } while (temp != cabeza);
        }
    }

    public int cuantos() {
        if (cabeza == null) {
            return 0;
        } else {
            return contar;
        }
        //ssout("Hay: "+cuantos())
    }

    public Boolean esvacio() {
        if (cabeza == null) {
            System.out.println("la bolsa está vacía");
            return true;
        } else {
            System.out.println("Posee Elementos");
            return false;
        }
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(Nodo cola) {
        this.cola = cola;
    }

//----------------------MENU----------------------------
   
    
    
    
    public void menu() {
        
        Scanner scanner = new Scanner(System.in);
        
        int Elemento, posX, posY, decision =0;

        String desc = "";
        do{
            try{
            System.out.println("Escoja la accion:");
            System.out.println("[1] Ingresar Datos a Bolsa");
            System.out.println("[2] Conteo de Datos en Lista");
            System.out.println("[3] Mostrar Datos en Bolsa");
            System.out.println("[4] EXIT");
            
            decision = scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Por favor ingrese un número");
            }
            switch(decision){
                case 1:
                    do{
                        try{
                    
                   
                            System.out.println("Ingrese el Elemento");
                            Elemento = scanner.nextInt();
                            System.out.println("");
                            System.out.println("Ingrese posicion en x");
                            posX = scanner.nextInt();
                            System.out.println("");
                            System.out.println("Ingrese posicion en y");
                            posY = scanner.nextInt();
                            
                            insertar(Elemento, posX, posY);
                            System.out.println("");
                            Scanner a = new Scanner(System.in);
                             System.out.println("Precione cualquier tecla para continuar y \n Para terminar la accion precione n");
                        desc=a.nextLine();
                        }catch(InputMismatchException e){
                            System.out.println("Por Favor ingrese un número");
                            menu();
                            
                        }
                         //   System.out.println("Precione cualquier tecla para continuar y \n Para terminar la accion precione n");
                        //desc=scanner.nextLine(); 
                        }while(!desc.equals("n"));
                    menu();
                    break;
                case 2:
                    System.out.println("Hay: "+cuantos()+" elementos en la lista");
                    menu();
                    break;
                case 3:
                    if(esvacio()){
                        
                    }else{
                        Recorrer();
                    }
                    menu();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            
        }while(decision !=4);
        
              
    }

}
