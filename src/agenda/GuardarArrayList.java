/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ESTEBAN
 */
public class GuardarArrayList {
    String Nombre_Archivo = "Contactos.txt";
    PrintWriter objArchivoEscritura;
    
    void guardarArrayList(ArrayList<Contacto> con1){
        File archivo;
        FileWriter writ;
        BufferedWriter bw;
        try{
            archivo = new File(Nombre_Archivo);
            writ = new FileWriter(archivo,true);
            bw = new BufferedWriter(writ);
            objArchivoEscritura = new PrintWriter(bw);
            for (int i = 0; i < con1.size(); i++) {
                objArchivoEscritura.append(con1.get(i).getCategoria()+","+con1.get(i).getNombre()+","+con1.get(i).getApellido()+","+con1.get(i).getDireccion()+","+con1.get(i).getZipCode()+","+con1.get(i).getCiudad()+","+con1.get(i).getNumTelefono()+","+con1.get(i).getEmail());
            }
        }catch(Exception e){
            System.out.println("Sucedio un error con guardar los datos");
        }
        
    }
    void agregarElemento(Contacto c1){
        
    }
}
