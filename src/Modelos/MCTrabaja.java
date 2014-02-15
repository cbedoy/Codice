/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Bedoy
 */
public class MCTrabaja {
    private int id;
    private Date fecha;
    private int cantidadVentas;
    private ArrayList<MCUsuario> usuario;

    public MCTrabaja(int id, Date fecha, int cantidadVentas, ArrayList<MCUsuario> usuario){
        this.id = id;
        this.fecha = fecha;
        this.cantidadVentas = cantidadVentas;
        this.usuario = usuario;
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cantidadVentas
     */
    public int getCantidadVentas() {
        return cantidadVentas;
    }

    /**
     * @param cantidadVentas the cantidadVentas to set
     */
    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    /**
     * @return the usuario
     */
    public ArrayList<MCUsuario> getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(ArrayList<MCUsuario> usuario) {
        this.usuario = usuario;
    }
}
