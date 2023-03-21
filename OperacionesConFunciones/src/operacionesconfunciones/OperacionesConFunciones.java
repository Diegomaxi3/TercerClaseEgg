/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesconfunciones;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class OperacionesConFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1 = 1 + Math.random() * 10;
        double n2 = 1 + Math.random() * 10;
        n1 = Math.round(n1);
        n2 = Math.round(n2);
        
        System.out.println("Numero 1: " + n1);
        System.out.println("Numero 2: " + n2);
        
        
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicar");
        System.out.print("que desea hacer : ");
        int op = new Scanner(System.in).nextInt();
        
        switch(op){
            case 1:mensaje(sumar(n1,n2));break;
            case 2:mensaje(restar(n1,n2));break;
            case 3:mensaje(dividir(n1,n2));break;
            case 4:mensaje(multiplicar(n1,n2));break;
        }      
    }
    
    public static double sumar(double n1, double n2){
        return n1 + n2;
    }
    
    public static double restar(double n1, double n2){
        return n1 - n2;
    }
    
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    
    public static double dividir(double n1, double n2){
        return n1 / n2;
    }
    
    public static void mensaje(double resultado){
        System.out.println("Resultado: " + resultado);
    }
    
}
