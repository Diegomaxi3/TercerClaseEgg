/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorarraynumaleatorios;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class VectorArrayNumAleatorios {

    /**
     * @param args the command line arguments
     */
    static int contador = 0;
    static int primerPos = -1;
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la longitud del arreglo:");
    int n = leer.nextInt();

    int[] numeros = new int[n];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = obtenerAleatorio();
    }

        System.out.print("[");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (i != numeros.length - 1){
          System.out.print(", ");
      }
    }
        System.out.print("]");
        System.out.println("");
        System.out.println("Ingrese el numero a buscar: ");
        int busqueda = leer.nextInt();
        if (buscar(numeros,busqueda)){
            System.out.println("El numero esta dentro del array");
            System.out.println("Primera Posicion: " + primerPos + ", Cantidada repeticiones: " + contador);
        }else  System.out.println("El numero no se encuentra en el array.");
  }

  public static int obtenerAleatorio() {
    return (int) Math.round(Math.random() * 15);
  }
  
  public static boolean buscar(int [] v,int n){
      contador = 0;
      boolean esta = false;
      for (int f = 0; f < v.length; f++) {
          if (n == v[f]){
             esta = true; 
             contador ++;
             if (primerPos == -1){
                 primerPos = f;
             }
          }
      }
      return esta;
  }
    
}
