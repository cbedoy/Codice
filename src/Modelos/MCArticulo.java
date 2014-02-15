/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Carlos Bedoy
 */
public class MCArticulo {
    private int id;
    private String modelo;
    private float precio;
    private float costo;
    private ArrayList<MCTipo> tipo;
    
    public MCArticulo(int id, String modelo, float precio, float costo, ArrayList<MCTipo> tipo){
        this.id = id;
        this.modelo = modelo;
        this.precio = precio;
        this.costo = costo;
        this.tipo = tipo;
    }

    public MCArticulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
     * @return the tipo
     */
    public ArrayList<MCTipo> getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(ArrayList<MCTipo> tipo) {
        this.tipo = tipo;
    }
}
