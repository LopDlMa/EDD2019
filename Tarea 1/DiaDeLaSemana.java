/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeDate;
/**
 *
 * @author PC
 */
public class DiaDeLaSemana {
    String[] dias = new String[]{"Lunes", "Martes", "Miercoles","Jueves","Viernes","Sabado","Domingo"};
    public int fecha[] = new int[3];
     public String decidir = "";
    Calendar calendario = Calendar.getInstance();
    
    public void Dia(){
       
       do{ 
         menu();
            System.out.println("Para continuar presione enter, de lo contrario presione 'n'");
            Scanner scanner = new Scanner(System.in);
            decidir = scanner.nextLine();
        
        
    }while(!decidir.equals("n"));
    }
    public void menu(){
       Scanner scanner = new Scanner (System.in);
       String data;
        System.out.println("Ingrese el día como un número");
        data = scanner.nextLine();
        
        if(fallo(data)){
        fecha[0] = Integer.parseInt(data);
        
        }else {
            System.out.println("Eso no es un numero");
            menu();
            
        }
        System.out.println("Ingrese el mes como un número");
        data = scanner.nextLine();
        
        if (fallo(data)){
        fecha[1]= Integer.parseInt(data);
        
        }else {
            System.out.println("Eso no es un numero");
            menu();
        }
        System.out.println("Ingrese el año como un número");
        data= scanner.nextLine();
        
        if (fallo(data)){
        fecha[2] = Integer.parseInt(data);
        
        
        }else {
            System.out.println("Eso no es un numero");
            menu();
        }
        
        if (fecha[0] > 0 && fecha[0]<32){
            if (fecha[1]> 0 && fecha[1] < 13){
                if (fecha[2]> 1699 && fecha[2]<2080){
                        System.out.println(Fecha(fecha));
                } else {
                    System.out.println("No es un año valido");
                }
            } else {
                System.out.println("El mes no existe");
            }
        }else {
            System.out.println("El dia no existe");
        }
       
    }
    
    public boolean fallo (String cadena){
    try{
        Integer.parseInt(cadena);
        return true;
    }catch (NumberFormatException e){
        return false;
    }
    }
    
    public String Fecha(int fecha[]){
    
    calendario.set(fecha[2],fecha[1]-1, fecha[0]);
    
    if(fecha[0] == calendario.get(Calendar.DATE)){
        System.out.println(calendario.get(Calendar.DATE) + "-" +(calendario.get(Calendar.MONTH) +1)+ "-" + calendario.get(Calendar.YEAR) );
        return dias [calendario.get(Calendar.DAY_OF_WEEK)-2];
        
       
                
    }else {
        System.out.println("No existe esa fecha");
        return "";
    }
    }
    
}
