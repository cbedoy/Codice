/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Controladores.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author Carlos Bedoy
 */
public class MCProducto  {
    
    
    private int id;
    private String tipo;
    private String modelo;
    private float costo;
    private float precio;
    private float numero;
    private int cantidad;
    private float precioIva;
    private int idCaracteristica;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
        
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the numero
     */
    public float getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(float numero) {
        this.numero = numero;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Object[] addRowProducto(){
        
        return new Object[]{id, tipo, modelo, costo, precio, numero, cantidad};
    }

    /**
     * @return the precioIva
     */
    public float getPrecioIva() {
        return precioIva;
    }

    /**
     * @param precioIva the precioIva to set
     */
    public void setPrecioIva(float precioIva) {
        this.precioIva = precioIva;
    }

    /**
     * @return the idCaracteristica
     */
    public int getIdCaracteristica() {
        return idCaracteristica;
    }

    /**
     * @param idCaracteristica the idCaracteristica to set
     */
    public void setIdCaracteristica(int idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }
    
    
}
