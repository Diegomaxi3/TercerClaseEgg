/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayde100;
/**
 *
 * @author Diego
 */
public class ArrayDe100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] v = llenar();
        for (int f = 99; f > 0; f--) {
            System.out.print(v[f]);
           if(f != 1) System.out.print(",");
        }
        System.out.println("");
    }
    
    public static int[] llenar(){
        int [] v =  new int[100];
        for (int f = 0; f < 100; f++) v[f] = f;                    
        return v;
    }
    
}
