/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;
import tarea_1.DiaDeLaSemana;
/**
 *
 * @author PC
 */
public class Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DiaDeLaSemana dia = new DiaDeLaSemana();
        System.out.println("DIA DE LA SEMANA DE UNA FECHA");
        System.out.println(" ");
       dia.Dia();
        CribaDeEratostenes criba = new CribaDeEratostenes();
        System.out.println("CRIBA DE ERATOSTENES");
        System.out.println(" ");
        criba.Lectura();
       
    }
    
}
