/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio.entidades;

/**
 *
 * @author Usuario
 */
public class Aula {
    private int nroAula;
    private int capacidad;
    private String pabellon;

    public Aula(int nroAula, int capacidad, String pabellon) {
        this.nroAula = nroAula;
        this.capacidad = capacidad;
        this.pabellon = pabellon;
    }

    public int getNroAula() {
        return nroAula;
    }

    public void setNroAula(int nroAula) {
        this.nroAula = nroAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }
    
    
    
    
    
    
}
