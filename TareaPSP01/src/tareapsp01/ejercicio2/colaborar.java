/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborar;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PANDA
 */
public class Colaborar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteracción número "+i);
            String comando = "java -jar lenguaje.jar "+(i*10)+" "+args[0];
            try {
                Runtime.getRuntime().exec(comando);
            } catch (IOException ex) {
                //Logger.getLogger(Colaborar.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR GENERAL");
            }
        }
    }
    
}
