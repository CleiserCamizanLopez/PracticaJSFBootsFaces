package Test_Packages;

import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.model.Cliente;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class TestCliente {

    static ArrayList<Cliente> list = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteDAO clidao;
        clidao = new ClienteCtrlImpl();
      list = clidao.readCliente();
for(Cliente item: list){
System.out.println (""+item.getNombres_razon_social());
}
    
       /* Categoria cat = new Categoria();
        cat.setId_categoria("4");
        cat.setName_cat("cleiser");
        cat.setEstado("1");
        if (catdao.createCategoria(cat)) {
            System.out.print("insertado");
        } else {
            System.out.print("error al insertar");
        }*/
    }
}
