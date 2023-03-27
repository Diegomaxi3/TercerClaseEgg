/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisas;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor;
        int tipoMoneda;
        
        System.out.println("Ingrese la cantidad a convertir: ");
        valor = new Scanner(System.in).nextInt();
        
        do{
             System.out.println("1 - Dollar ");
             System.out.println("2 - Yenes");
             System.out.println("3 - Libras ");
             System.out.println("Elija la opcion a convertir: ");
             tipoMoneda = new Scanner(System.in).nextInt();
           //  new Scanner(System.in).nextLine();
        }while(tipoMoneda > 3 || tipoMoneda < 1 );
        
        divisas(valor,tipoMoneda);
    }
    
    public static void divisas(double valor,int tipoMoneda){
        switch(tipoMoneda){
            case 1:System.out.println(valor * 1.28611);break;
            case 2:System.out.println(valor * 129.852);break;
            case 3:System.out.println(valor * 0.86);break;
        }      
    }
    
}
