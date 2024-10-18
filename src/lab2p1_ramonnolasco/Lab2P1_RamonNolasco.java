/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_ramonnolasco;
import java.util.Scanner;
import java.util.Random;
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opciones");
        System.out.println("1 - Numeros comunes en multiplicacion");
        System.out.println("2 - Juego de suerte");
        System.out.println("3 - Llenar el trapecio");
        System.out.println("4 - Salida");
        int opcion;
        System.out.println("Elija una opcion:");
        opcion = scanner.nextInt();
        while ((opcion != 1) && (opcion != 2) && (opcion != 3) && (opcion != 4)){
            System.out.println("Elija una opción valida entre 1 y 4:");
            opcion = scanner.nextInt();
        }
        
        if (opcion == 1){
            
            int ntabla1;
            System.out.println("Ingrese el número de la primera tabla:");
            ntabla1 = scanner.nextInt();
            while (ntabla1 < 1 && ntabla1 > 12){
                System.out.println("Ingrese un numero entre 1 y 12:");
                ntabla1 = scanner.nextInt();
            }
            int ntabla2;
            System.out.println("Ingrese el numero de la segunda tabla");
            ntabla2 = scanner.nextInt();
            while (ntabla2 < 1 && ntabla2 > 12){
                System.out.println("Ingrese un numero entre 1 y 12:");
                ntabla2 = scanner.nextInt();
            }
            
            int tabl
            
            
            System.out.println("Numeros de");
            
            
            
            
        }
        
    }
    
}
