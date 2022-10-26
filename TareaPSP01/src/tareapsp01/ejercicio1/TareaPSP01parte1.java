/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapsp01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PANDA
 */
public class TareaPSP01parte1 {

    public static void ordenarNumeros(String numeros){
        String vNumeros[] = numeros.split(" ");
        int vNumerosConvertido[] = new int[vNumeros.length];
        
        for (int i = 0; i < vNumerosConvertido.length; i++) {
            vNumerosConvertido[i]=Integer.parseInt(vNumeros[i]);
        }
        
        Arrays.sort(vNumerosConvertido);
        
        for (int numero : vNumerosConvertido) {
            System.out.print(numero+" ");
        }
    }

    public static String aleatorios(){
        ArrayList vNumeros = new ArrayList();
        String numerosAleatorios = "";
        for (int i = 1; i <= 40; i++) {
            vNumeros.add((int)Math.floor(Math.random()*100+1));
        }
        
        for (Object numero : vNumeros) {
            numerosAleatorios+=numero+" ";
        }
        return numerosAleatorios;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ordenarNumeros("65 76 16 66 11 84 47 30 94 68 56 24 36 35 12 48 27 49 42 2 36 20 39 55 14 67 64 90 81 64 60 98 63 66 20 76 26 97 40 75");
        //System.out.println(aleatorios());
        ordenarNumeros(aleatorios());
    }
    
}
