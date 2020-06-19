/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_felipelin;

import java.io.Serializable;

/**
 *
 * @author felipelinzhao
 */
public class Archivo implements Serializable {

    private String nombre;
    private String link;
    private String extension;
    private int tamano;
    private static final long SerialVersionUID = 777l;

    public Archivo() {
    }

    public Archivo(String nombre, String link, String extension, int tamano) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamano = tamano;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;

    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", link=" + link + ", extension=" + extension + ", tamano=" + tamano + '}';
    }

}
