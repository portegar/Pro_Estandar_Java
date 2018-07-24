package estandaresjava;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class verificacion {
public static String verifica(BufferedReader archivo,String nombrearchivo)
{
    try {
        String  leerlinea = archivo.readLine();
        int tamañofila = leerlinea.length();
        /*1.Los nombres para cada uno de los paquetes deben ser nombres cortos de longitud entre 2 y 10
        caracteres, utilizar solamente caracteres alfabéticos para el nombre y siempre en minúsculas,
        a excepción de la sigla del sistema.
        */
        for (int i = 1; i <= tamañofila; i++) {
            leerlinea = archivo.readLine();
            System.out.println(leerlinea);
             // StringTokenizer st = new StringTokenizer (leerlinea); // lee palabra por palabra
            
//            while (st.hasMoreElements())
//            {
//                int numTokens = 1 ;
//                String s2 = st.nextToken();
//                numTokens ++;
//                System.out.println ("    Palabra " + numTokens + " es: " + s2);
//             }
        }
        
        
        
        
    } catch (IOException ex) {
        Logger.getLogger(verificacion.class.getName()).log(Level.SEVERE, null, ex);
  
    }   
    return null;   
}   
}

