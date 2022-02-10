/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coches;

/**
 *
 * @author DELL
 */
public class RegCoches {
    private String tipo;
    private String marca;
    private Double km;
    
    //Constructor de la clase RegCoches
    public RegCoches(String tipo, String marca, Double km) {
        this.tipo = tipo;
        this.marca = marca;
        this.km = km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }
    
    
    
    
}
