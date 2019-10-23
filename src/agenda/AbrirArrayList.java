/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class AbrirArrayList extends GuardarArrayList{
    String Nombre_Archivo = "Contactos.txt";
    String lectura;
    public ArrayList<Contacto> contactosGuardados = new ArrayList();
    
    ArrayList<Contacto> leerArrayList(){
        String datos;
        try{
            BufferedReader bf = new BufferedReader(new FileReader(Nombre_Archivo));
            while((datos = bf.readLine()) != null){
                contactosGuardados.add(new Contacto(Integer.parseInt(datos.split(",",8)[0]), datos.split(",",8)[1], datos.split(",",8)[2], datos.split(",",8)[3], datos.split(",",8)[4], datos.split(",",8)[5], datos.split(",",8)[6], datos.split(",",8)[7]));
            }
        }catch(Exception e){
            System.out.println("Nose encontro el archivo");
        }
        return contactosGuardados;
    }
    
    
    
}
