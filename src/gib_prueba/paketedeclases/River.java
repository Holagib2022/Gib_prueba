/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gib_prueba.paketedeclases;

/**
 *
 * @author gasto
 */
public class River {
    private int hinchas;
    private String ubicacion;
    private String estadio;

    public River(int hinchas, String ubicacion) {
        this.hinchas = hinchas;
        this.ubicacion = ubicacion;
    }
    
    

    public int getHinchas() {
        return hinchas;
    }

    public void setHinchas(int hinchas) {
        this.hinchas = hinchas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
