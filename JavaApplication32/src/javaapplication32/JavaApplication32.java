/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        esMultiplo(n1,n2);
    }
    
    public static void esMultiplo(int n1, int n2){
        if (n1 % n2 == 0){
            System.out.println("Si son multiplos");
        }else System.out.println("No son multiplos");
    }
    
}
