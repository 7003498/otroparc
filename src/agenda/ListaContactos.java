/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author ESTEBAN
 */
public class ListaContactos extends AbrirArrayList{
    GuardarArrayList guardarArchivoTxt;
    AbrirArrayList abrirArchivoTxt;
    ArrayList<Contacto> listaContactos = new ArrayList();

    public ListaContactos() {
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
    
    void agregarContacto(Contacto c1){
        listaContactos.add(c1);
    }
    void eliminarContacto(int n1){
        listaContactos.remove(n1);
    }
    void guardarAgenda(){
        
    }
   // ArrayList<Contacto> abrirAgenda(){
        
        
    //}
    void agregarContactoTxt(Contacto c1){
        
    }

    

    
}
