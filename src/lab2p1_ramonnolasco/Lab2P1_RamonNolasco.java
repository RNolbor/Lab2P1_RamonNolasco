/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_ramonnolasco;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Lab2P1_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        
        do {
            System.out.println("-----  Menu de opciones  -----");
            System.out.println("1) Descomposicion en factores");
            System.out.println("2) Numero mas alejado");
            System.out.println("3) Complemento de binario ");
            System.out.println("4) Salir");
            System.out.println("Elija una opcion: ");
            int opcion = input.nextInt();
            
            if (opcion == 1){
                System.out.println("Ingrese un numero para descomponer: ");
                int numero = input.nextInt();
                System.out.println("Numero ingresado:");
                System.out.println(numero);
                System.out.println("Factores:");
                
                int tempN = numero;
                
                while (tempN > 1){
                    
                    if (tempN % 2 == 0){
                        tempN /= 2;
                        System.out.print(" 2 ");
                    }else if (tempN % 3 == 0){
                        tempN /= 3;
                        System.out.print(" 3 ");
                    }else if (tempN % 5 == 0){
                        tempN /= 5;
                        System.out.print(" 5 ");
                    }else if (tempN % 7 == 0){
                        tempN /= 7;
                        System.out.print("");
                    }
                    
                }
                
                
                
                
            }else if (opcion == 2){
                
            }else if (opcion == 3){
                
            }else if (opcion == 4){
                menu = false;
                break;
            }
            
        }while(menu == true);
        
    }
    
}
