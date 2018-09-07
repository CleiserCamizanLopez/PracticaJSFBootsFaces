/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author user
 */
public class Cliente {
    
    public Cliente(){
    
    }


    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombres_razon_social() {
        return nombres_razon_social;
    }

    public void setNombres_razon_social(String nombres_razon_social) {
        this.nombres_razon_social = nombres_razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni_ruc() {
        return dni_ruc;
    }

    public void setDni_ruc(String dni_ruc) {
        this.dni_ruc = dni_ruc;
    }

    public Cliente(String id_cliente, String nombres_razon_social, String telefono, String correo, String dni_ruc) {
        this.id_cliente = id_cliente;
        this.nombres_razon_social = nombres_razon_social;
        this.telefono = telefono;
        this.correo = correo;
        this.dni_ruc = dni_ruc;
    }
    
    String id_cliente, nombres_razon_social, telefono, correo, dni_ruc;
    
}
