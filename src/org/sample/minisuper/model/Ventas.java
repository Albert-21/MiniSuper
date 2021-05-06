/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.minisuper.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alberto
 */
@Entity
@Table(name = "ventas")
public class Ventas implements Serializable {
    
    @Id
    @Column
    private long id_venta;
    @Column
    private Time hora;
    @Column
    private Date fecha;
    @Column
    private long id_usuario;
    @Column
    private long codigo_producto;

    public Ventas() {
    }

    public Ventas(Time hora, Date fecha, long id_usuario, long codigo_producto) {
        this.hora = hora;
        this.fecha = fecha;
        this.id_usuario = id_usuario;
        this.codigo_producto = codigo_producto;
    }

    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public long getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(long codigo_producto) {
        this.codigo_producto = codigo_producto;
    }
    
    
    
}
