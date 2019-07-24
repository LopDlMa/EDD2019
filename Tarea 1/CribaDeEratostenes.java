/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CribaDeEratostenes {
    //funciona para encontrar todos los primos menores que n cuando n es < a 10 millones
    //n0 = 2 

    public String decidir = "";
    public int N, inicial, mult, entrada;
    

    public void Lectura() {

        do {
            menu();
            System.out.println("");
            System.out.println("Para continuar presione enter, de lo contrario presione 'n'");
            Scanner scanner = new Scanner(System.in);
            decidir = scanner.nextLine();

        } while (!decidir.equals("n"));

    }

    public void menu() {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese el  número");
            entrada = scanner.nextInt();
            boolean primo[] = new boolean[entrada];
            try {

                for (inicial = 0; inicial < entrada; inicial++) {
                    primo[inicial] = true;
                }
                for (inicial = 2; inicial < entrada; inicial++) {//marcar multiplos
                    for (mult = 2; inicial * mult < entrada; mult++) {
                        primo[inicial * mult] = false;
                    }
                }

                System.out.println("Los numeros primos son: ");
                for (inicial = 2; inicial < entrada; inicial++) {

                    if (primo[inicial]) {
                        {
                            System.out.print(inicial + " ");
                        }

                    }

                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un numero");
                menu();
            }

        } while (N >= 1 && N <= 10000000);

    }
}
