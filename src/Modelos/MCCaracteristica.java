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
public class MCCaracteristica {
    private int  id;
    private float numero;
    private int cantidad;
    //private ArrayList<MCArticulo> articulos;
    private  int idArticulo;
    private String modelo;

    
    public MCCaracteristica(int id, float numero, int cantidad, int idArticulo){
        this.id = id;
        this.numero = numero;
        this.cantidad = cantidad;
        this.idArticulo = idArticulo;
        //this.articulos = articulos;
    }

    public MCCaracteristica (){
        
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
     * @return the articulos
     */
    //public ArrayList<MCArticulo> getArticulos() {
//        return articulos;
    //}

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(ArrayList<MCArticulo> articulos) {
 //       this.articulos = articulos;
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
}
