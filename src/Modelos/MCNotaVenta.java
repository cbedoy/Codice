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
public class MCNotaVenta {
    private float pago;
    private float cambio;
    private float total;
    private float totalIVA;
    private ArrayList<MCArticuloVenta> articulos;
    
    /**
     * @return the pago
     */
    public float getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(float pago) {
        this.pago = pago;
    }

    /**
     * @return the cambio
     */
    public float getCambio() {
        return cambio;
    }

    /**
     * @param cambio the cambio to set
     */
    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the totalIVA
     */
    public float getTotalIVA() {
        return totalIVA;
    }

    /**
     * @param totalIVA the totalIVA to set
     */
    public void setTotalIVA(float totalIVA) {
        this.totalIVA = totalIVA;
    }

    /**
     * @return the articulos
     */
    public ArrayList<MCArticuloVenta> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(ArrayList<MCArticuloVenta> articulos) {
        this.articulos = articulos;
    }
    
}
