/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ClienteCtrlImpl;
import java.io.Serializable;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.model.Cliente;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "clienteCtrl")
@SessionScoped
public class ClienteCtrl implements Serializable {

    private Cliente selected;
    private boolean est;
    ClienteDAO clidao;
    private ArrayList<Cliente> list = new ArrayList<>();

    public ClienteCtrl() {
        this.selected = new Cliente();
        this.clidao = new ClienteCtrlImpl();
    }

    public void createCategoria() {        
        if (clidao.createCliente(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public ArrayList<Cliente> getList() {
        list = clidao.readCliente();
        return list;
    }

    public void updateCategoria(Cliente cli) {
        System.out.println("categoria = "+cli.getNombres_razon_social());
        if (clidao.updateCliente(cli)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("Error al momento de actualizar");
        }
    }
    public void deleteCliente(String id){
        
        if (clidao.deleteCliente(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Cliente getSelected() {
        return selected;
    }

    public void setSelected(Cliente selected) {
        this.selected = selected;
    }

}
