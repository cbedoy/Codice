/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Carlos Bedoy
 */
public class ValidadorEntradas {

    private static Pattern patter;
    private static Matcher matcher;


    public static String validarUsuario(String cadena) {
        if(cadena.length() <=0)
            return "Campo usuario no puede estar vacios";
        else
        if (cadena.length() < 12) {
            ValidadorEntradas.patter = Pattern.compile("^[a-zA-Z0-9]{5,12}");
            ValidadorEntradas.matcher = ValidadorEntradas.patter.matcher(cadena);
            if (ValidadorEntradas.matcher.matches()) {
                return "OK";
            } else {
                return ""
                        + "Campo usuario invalido\n"
                        + "Solo se permiten letras de la A-Z y a-z\n"
                        + "Con un numero de carateres de 5 a 12";
            }
        } else {
            return ""
                        + "Campo usuario invalido\n"
                        + "Los caracteres ingresados sobrepasan a 12";
        }
    }
    
    
    public static String validarContrasena(String cadena) {
        if(cadena.length() <=0)
            return "Campo usuario no puede estar vacios";
        else
        if (cadena.length() < 12) {
            ValidadorEntradas.patter = Pattern.compile("^[a-zA-Z0-9]{5,12}");
            ValidadorEntradas.matcher = ValidadorEntradas.patter.matcher(cadena);
            if (ValidadorEntradas.matcher.matches()) {
                return "OK";
            } else {
                return ""
                        + "Campo contrasena invalido\n"
                        + "Solo se permiten letras de la A-Z y a-z\n"
                        + "Con un numero de carateres de 5 a 12";
            }
        } else {
            return ""
                        + "Campo contrasena invalido\n"
                        + "Los caracteres ingresados sobrepasan a 12";
        }
    }
    
    public static String validarTexto(String cadena, String campo) {
        if(cadena.length() <=0)
            return "Campo "+campo+" no puede estar vacios";
        else if(cadena.length() <= 4){
            return "Introdusca un nombre mayor a 4 letras \nNumero de letras introducidas: "+cadena.length()+" ";
        }else
            
        if (cadena.length() < 12 && cadena.length() >0) {
            ValidadorEntradas.patter = Pattern.compile("^[a-zA-Z]{5,15}");
            ValidadorEntradas.matcher = ValidadorEntradas.patter.matcher(cadena);
            if (ValidadorEntradas.matcher.matches()) {
                return "OK";
            } else {
                return ""
                        + "Campo "+campo+" invalido\n"
                        + "Solo se permiten letras de la A-Z y a-z\n";
            }
        } else {
            return ""
                        + "Campo "+campo+" invalido\n"
                        + "Los caracteres ingresados sobrepasan a 15";
        }
    }
    
    
    public static String validarPago(String cadena){
        try{
            Float.parseFloat(cadena);
            ValidadorEntradas.patter = Pattern.compile("^\\d+|^\\d+\\.?\\d+");
            ValidadorEntradas.matcher = ValidadorEntradas.patter.matcher(cadena);
            if (ValidadorEntradas.matcher.matches()) {
                return "OK";
            } else {
                return ""
                        + "Formato de pago invalido\n"
                        + "Solo puede contener enteros y/o dos decimales\n"
                        + "Por ejemplo 12.50, 130.50, 80.99";
            }      
        }catch(Exception e){
            return "Solo se permiten numeros, puede incluir un punto (.) para los centavos";
        }
    }
    
    public static String validarPrecio(String cadena){
        try{
            Float.parseFloat(cadena);
            return "OK";
        }catch(Exception e){
            return "Solo se permiten numeros, puede incluir un punto (.) para los centavos";
        }
    }
    
    
    public static String validarCosto(String cadena){
        try{
            System.out.println(cadena);
            Float.parseFloat(cadena);
            
            return "OK";
        }catch(Exception e){
            return "Campo costo no valido\nSolo se permiten numeros, puede incluir un punto (.) para los centavos";
        }
    }
    
    public static String validarCantidad(String cadena){
        try{
            Integer.parseInt(cadena);
            return "OK";
        }catch(Exception e){
            return "Solo se permiten numeros sin decimales";
        }
    }
    
    public static String validarIDS(String cadena){
        try{
            Integer.parseInt(cadena);
            return "OK";
        }catch(Exception e){
            return "Las clavas deben ser numeros";
        }
    }
    
    
    public static String validarCampoBusqueda(String cadena){
        if (cadena.length() < 15) {
            ValidadorEntradas.patter = Pattern.compile("^[a-zA-Z0-9]{0,15}");
            ValidadorEntradas.matcher = ValidadorEntradas.patter.matcher(cadena);
            if (ValidadorEntradas.matcher.matches()) {
                return "OK";
            } else {
                return ""
                        + "Campo busqueda invalido\n"
                        + "Solo se permiten letras de la A-Z y a-z\n"
                        + "Con un numero de carateres de 0 a 15";
            }
        } else {
            return ""
                        + "Campo usuario invalido\n"
                        + "Los caracteres ingresados sobre pasan a 15";
        }
    }
    
    
    
    
    
    

    
}
