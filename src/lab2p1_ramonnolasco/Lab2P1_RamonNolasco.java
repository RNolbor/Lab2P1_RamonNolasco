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
                System.out.println(""); // AQUI SE PUDO PONER UN UNO AL INICIO COMO EN EL EJEMPLO:("1 ");
                int factor = 3;
                
                while (tempN % 2 == 0){
                    tempN /= 2;
                    System.out.print(2 + " ");
                }
                while (factor * factor <= tempN){
                    while (tempN % factor == 0){
                        System.out.print(factor + " ");
                        tempN /= factor;
                    }
                    factor += 2;
                }
                if (tempN > 1){
                    System.out.print(tempN + " ");
                }
                
                
            }else if (opcion == 2){
                
                
                System.out.println("Ingrese numero 1: ");
                int numero1 = input.nextInt();
                System.out.println("Ingrese numero 2: ");
                int numero2 = input.nextInt();
                System.out.println("Ingrese numero 3: ");
                int numero3 = input.nextInt();
               
              
                int distancia1 = numero2 - numero1;
                int distancia2 = numero3 - numero1;
                int distancia3 = numero3 - numero2;
                
                
                if (distancia1 < 0){
                    distancia1 = -distancia1;
                }
                if (distancia2 < 0){
                    distancia2 = -distancia2;
                }
                if (distancia3 < 0){
                    distancia3 = -distancia3;
                }
                
                int distanciaTotal1 = distancia1 + distancia2;
                int distanciaTotal2 = distancia1 + distancia3;
                int distanciaTotal3 = distancia2 + distancia3;
                
                if (distanciaTotal1 >= distanciaTotal2 && distanciaTotal1 >= distanciaTotal3){
                    System.out.println("El primer numero, " + numero1 + ", es el mas alejado");
                }else if (distanciaTotal2 >= distanciaTotal1 && distanciaTotal2 >= distanciaTotal3){
                    System.out.println("El segundo numero, " + numero2 + ", es el mas alejado");
                }else {
                    System.out.println("El tercer numero, " + numero3 + ", es el mas alejado");                    
                }
                
                
                
                
                
            }else if (opcion == 3){
                
            }else if (opcion == 4){
                menu = false;
                break;
            }
            
        }while(menu == true);
        
    }
    
}
