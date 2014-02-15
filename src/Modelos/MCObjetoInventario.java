/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Carlos Bedoy
 */
public  class MCObjetoInventario {
    private int idArticulo;
    private String tipo;
    private String modelo;
    private float costo;
    private float precio;
    private float numero;
    private int cantidad;
    private int idCaracteristicas;

    public void Data(){
        System.out.println(idArticulo+" - "+tipo+" - "+modelo+" - "+idCaracteristicas);
    }
    /**
     * @return the idArticulo
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo the idArticulo to set
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
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

    /**
     * @return the idCaracteristicas
     */
    public int getIdCaracteristicas() {
        return idCaracteristicas;
    }

    /**
     * @param idCaracteristicas the idCaracteristicas to set
     */
    public void setIdCaracteristicas(int idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }
    
}
