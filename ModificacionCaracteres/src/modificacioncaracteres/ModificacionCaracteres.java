/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificacioncaracteres;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class ModificacionCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una frase:");
        String frase = new Scanner(System.in).nextLine();
        for(int c=0;c < frase.length(); c++ ){
            String letra = frase.substring(c, c +1 );
            
            if( letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") 
                    || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")
                    || letra.equalsIgnoreCase("U")){
                 frase = frase.substring(0, c) + modificador(letra.toUpperCase()) + frase.substring(c+1);
            }
        }
        System.out.println(frase);
    }
    
    public static String modificador(String character){
        String letra = "";
        switch(character){
            case "A":letra = "@"; break;
            case "E":letra = "#"; break;
            case "I":letra = "$"; break;
            case "O":letra = "%"; break;
            case "U":letra = "*"; break;
            
        }
        return letra;
    }
    
}


