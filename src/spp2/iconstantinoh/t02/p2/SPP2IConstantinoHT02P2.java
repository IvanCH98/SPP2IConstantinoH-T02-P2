/* //Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.t02.p2;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int valinf, valsup, num;
    Scanner kb=new Scanner(System.in);
    System.out.print("Ingrese su valor inferior: ");
    valinf=kb.nextInt();
    System.out.print("Ingrese su valor superior: ");
    valsup=kb.nextInt();
    
    if(valinf>valsup){
        System.out.println("Opción no válida"); 
                }
    
    System.out.println("Numeros enteros entre "+valinf+" y "+valsup+"\n");
    for (num = valinf+1; num< valsup; num++) {
  
        System.out.println(num+":\n");  
        
    if(num%2==0){
        System.out.println("SI es par");
    }else{
        System.out.println("No es par");
    }
    
    if(num%3==0){
        System.out.println("SI es divisible entre 3");
    }else{
        System.out.println("No es divisible entre 3");
    }
    
    if(num%5==0){
        System.out.println("SI es divisible entre 5\n");
    }else{
        System.out.println("No es divisible entre 5\n");
   } 
    }
     }
     }

    
    
 
    
