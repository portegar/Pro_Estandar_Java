package estandaresjava;
import java.io.BufferedReader; //LLER ARCHIVO
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import estandaresjava.verificacion;
import static estandaresjava.verificacion.verifica;

public class EstandaresJava {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    try {
        File archivo = new File ("/Volumes/LEXAR/archivo.java");//carga de archivo
        BufferedReader br = new BufferedReader (new FileReader (archivo)); // Cargamos el buffer con el contenido del archivo
        String  nombrearchivo = archivo.getName();//Nombre del archivo
        verifica(br,nombrearchivo); //enviando parametros a la funcion verifica 
        }
    catch(FileNotFoundException e)
    {
        System.out.println(e);
    }

       
       
        
//        System.out.println ("Separando la linea en trozos tenemos las siguientes palabras:");  
       //  bucle por todas las palabras
//       
}

     

}
