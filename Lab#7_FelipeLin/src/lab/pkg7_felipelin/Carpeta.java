/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_felipelin;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author felipelinzhao
 */
public class Carpeta implements Serializable {

    private String nombre;
    private String link;
    private ArrayList<Archivo> lista_archivo = new ArrayList();
    private ArrayList<Carpeta> lista_carpeta = new ArrayList();
    private static final long SerialVersionUID = 888l;

    public Carpeta() {
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getLista_archivo() {
        return lista_archivo;
    }

    public void setLista_archivo(ArrayList<Archivo> lista_archivo) {
        this.lista_archivo = lista_archivo;
    }

    public ArrayList<Carpeta> getLista_carpeta() {
        return lista_carpeta;
    }

    public void setLista_carpeta(ArrayList<Carpeta> lista_carpeta) {
        this.lista_carpeta = lista_carpeta;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "nombre=" + nombre + ", link=" + link + ", lista_archivo=" + lista_archivo + ", lista_carpeta=" + lista_carpeta + '}';
    }

}
