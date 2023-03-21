/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npersonasmayoredad;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class NPersonasMayorEdad {
      static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String op="S";
        String nombre="";
        int edad = 0;
        do{
            System.out.println("Ingrese su Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
            sc.nextLine();
            imprimir(nombre,edad);
            mayor(edad);
            do{
              System.out.println("Desae seguir cargando datos? (S/N) ");
              
              op = sc.nextLine();
            }while(op.equalsIgnoreCase("S") && op.equalsIgnoreCase("N"));
        }while(op.equalsIgnoreCase("S"));
    }
    
    public static void imprimir(String nombre, int edad){
        System.out.print("[Nombre: " + nombre + " ,Edad: " + edad + "] ");
    } 
    
    public static void mayor(int edad){
        if (edad > 18 ) 
            System.out.println("Es mayor de Edad");
        else
            System.out.println("No es mayor de Edad");
    }
    
}
