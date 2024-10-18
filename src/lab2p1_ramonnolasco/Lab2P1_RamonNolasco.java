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
        Random random = new Random();
        boolean juego = true;
        while (juego){
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
            
                int contador1 = 1;
                int contador2 = 1;

                String resultado = "Numeros de la tabla de " + ntabla1 + " encontrados en la tabla de " + ntabla2 + ": ";
           
            
                while (contador1 <= 12){
                    contador2 = 1;
                    boolean encontrado = false;
                    while (contador2 <= 12){
                        if (ntabla1 * contador1 == ntabla2 * contador2){
                            encontrado = true;
                            break;
                        }    
                        contador2 += 1;
                    }
                    if (encontrado == true){
                        resultado += (ntabla1 * contador1) + " ";
                    }
                    else {
                        resultado += " ___ ";
                    }
                    contador1 += 1;
                }
                       
                System.out.println(resultado);
                continue;
            
            
            
            }
        
            if (opcion == 2){
            
                int pjugador = 1 + random.nextInt(10); 
                int pmaquina = 0;
            
                int ronda = 1;
            
                while (ronda <= 3) {
                    if (pjugador > 20){
                        System.out.println("----------------------------------------");                   
                        System.out.println("puntos de jugador: " + pjugador);
                        System.out.println("puntos de maquina: " + pmaquina);
                        System.out.println("----------------------------------------");
                        System.out.println("El jugador se paso de 20, la computadora gana");
                        break;
                    }
                    else if (pmaquina > 20){
                        System.out.println("----------------------------------------");                    
                        System.out.println("puntos de jugador: " + pjugador);
                        System.out.println("puntos de maquina: " + pmaquina);
                        System.out.println("----------------------------------------");
                        System.out.println("La computadora se paso de 20, el jugador gana");
                        break;
                    }
                
                    System.out.println("puntos de jugador: " + pjugador);
                    System.out.println("puntos de maquina: " + pmaquina);
                    System.out.println("-------------------------------------------");
                    System.out.println("Que desea hacer?");
                    System.out.println("1) Agregar 1");
                    System.out.println("2) Agregar 2");
                    System.out.println("3) Seguir");
                    System.out.println("4) Terminar");
                
                    int eleccion;
                    eleccion = scanner.nextInt();
                
                    while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4){
                        System.out.println("Ingrese un valor entre 1 y 4: ");
                        eleccion = scanner.nextInt();
                    }
                
                    if (eleccion == 1){
                        pjugador += 1;
                        continue;
                    }
                    else if (eleccion == 2){
                        pjugador += 2;
                        continue;
                    }
                    else if (eleccion == 3){
                        pmaquina += 1 + random.nextInt(10);
                        ronda += 1;
                    }
                    else if (eleccion == 4){
                        pmaquina += 1 + random.nextInt(10);
                        break;
                    }
                    if (pmaquina > pjugador){
                        System.out.println("----------------------------------------");                    
                        System.out.println("puntos de jugador: " + pjugador);
                        System.out.println("puntos de maquina: " + pmaquina);
                        System.out.println("----------------------------------------");
                        System.out.println("La computadora gana");                    
                    }
                    else if (pjugador > pmaquina){
                        System.out.println("----------------------------------------");                    
                        System.out.println("puntos de jugador: " + pjugador);
                        System.out.println("puntos de maquina: " + pmaquina);
                        System.out.println("----------------------------------------");
                        System.out.println("El jugador gana");                    
                    }
                }
            
            }
        }
    
    }
}