/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapsp01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author PANDA
 */
public class TareaPSP01parte2 {
    
    public static void lenguaje(int conjuntoCaracteres, String nombreFichero){
        //Posibles letras
        String letras = "abcdefghijklmnopqrstuvwxyz";
        //Como no se especifica el número de caracteres por linea, pongo 10.
        int numCaracteresLinea = 10;
        //Inicializamos la lectura y escritura de ficheros
        Scanner leer = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        File fichero = null;
        
        fichero = new File(nombreFichero);
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                //Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al crear fichero");
            }
        }
        
        try {
            fw = new FileWriter(fichero);
            pw = new PrintWriter(fichero);
            
            for (int i = 0; i < conjuntoCaracteres; i++) {
                for (int j = 1; j <= 10; j++) {
                    pw.print(letras.charAt((int)Math.floor(Math.random()*26)));
                }
                pw.println();
            }
        } catch (IOException ex) {
            System.out.println("Error al escribir en fichero");
        }finally{
            if(pw!=null){
                pw.close();
            }
        }
    }
    
    public static void main(int numLineas, String nombreFichero) {
        lenguaje(numLineas, nombreFichero);
    }
}


