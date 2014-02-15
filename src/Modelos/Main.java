/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Vistas.*;
import java.io.File;

/**
 *
 * @author Carlos Bedoy
 */
public class Main {
    public static void main(String[]args){
        File directorio=new File("c:\\CODICE\\"); 
        directorio.mkdir(); 
        new Loading();

    }
}
